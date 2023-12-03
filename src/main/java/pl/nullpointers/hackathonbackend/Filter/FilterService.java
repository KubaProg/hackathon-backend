package pl.nullpointers.hackathonbackend.Filter;

import org.springframework.stereotype.Service;
import org.w3c.dom.css.Counter;
import pl.nullpointers.hackathonbackend.Cable.*;
import pl.nullpointers.hackathonbackend.counting.CounterService;
import pl.nullpointers.hackathonbackend.inputHandler.Input;

import java.util.*;

@Service
public class FilterService {



    private static final Map<String, String> METAL_TYPE_MAPPING = new HashMap<>();
    private static final Map<String, String> MATERIAL_TYPE_MAPPING = new HashMap<>();
    private static final Map<String, String> ISOLATION_TYPE_MAPPING = new HashMap<>();
    private CableDataRepository cableDataRepository;
    private CableDataMapper cableDataMapper;
    private CounterService counterService;

    public FilterService(CableDataRepository cableDataRepository, CableDataMapper cableDataMapper, CounterService counterService) {
        this.cableDataRepository = cableDataRepository;
        this.cableDataMapper = cableDataMapper;
        this.counterService = counterService;
    }

    static {
        METAL_TYPE_MAPPING.put("a", "Cu");
        METAL_TYPE_MAPPING.put("b", "Al");

        MATERIAL_TYPE_MAPPING.put("a", "Cu");
        MATERIAL_TYPE_MAPPING.put("b", "Al");

        ISOLATION_TYPE_MAPPING.put("a", "PVC (polichlorek winylu)");
        ISOLATION_TYPE_MAPPING.put("b", "XLPE (polietylen sieciowany)");
        ISOLATION_TYPE_MAPPING.put("c", "Bezhalogenowe klasy B2ca");
    }




    public List<CableOutput> filterCables(Input input) {

        List<CableData> cables = cableDataRepository.findAll();
        List<CableOutput> filteredCables = new ArrayList<>();

        for (CableData cable : cables) {
            if (filterByMetalType(cable.getCableType(), input.getMaterial())
                    && filterByInsulationType(cable.getCableType(), input.getIsolation())
                    && filterByNumberOfLoadedCores(cable.getNumberOfCoresLoaded(), input.getCoresLoaded())
                    && filterByInstallationMethod(cable.getReferenceMethod(), input.getTypeOfInstalation())) {


                //Obliczamy tutaj Iobl po raz pierwszy
                Double extractVoltage = counterService.extractVoltage(String.valueOf(input.getCoresLoaded()));
                Double Iobl = counterService.countIobl(Double.parseDouble(input.getPower()), extractVoltage);


                //Teraz wyciągamy dane z tabelek i na podstawie wspł. korygujących liczymy Iost

                Double airTemperatureFactor = 1.0;
                Double soilTemperatureFactor = 1.0;
                Double soilResistivityFactor = 1.0;

                //temperatura i powietrze czynnik
                if(input.getTypeOfInstalation().contains("E") || cable.getCableType().contains("F") ){
                    airTemperatureFactor = counterService.countAirTemperatureFactor(cable.getCableType(), Integer.parseInt(input.getTemperature()));
                }

                //temperatura i gleba czynnik i rezystywnosc czynnik
                if(input.getTypeOfInstalation().contains("D")){
                    soilTemperatureFactor = counterService.countSoilTemperatureFactor(cable.getCableType(), Integer.parseInt(input.getTemperature()));
                    soilResistivityFactor = counterService.countSoilResistivityFactor(cable.getCableType(), Double.valueOf(input.getSoilResistivity()));
                }

                //ostateczny prad
                Double Iost = counterService.countIost(Iobl, airTemperatureFactor, soilTemperatureFactor, soilResistivityFactor);

                //bierzemy sobie przekroj
                List<ConductorCrossSection> conductorCrossSections = cable.getConductorCrossSections();

                Double prad = conductorCrossSections.stream()
                        .filter(crossSection -> crossSection.getCurrentCapacity() > Iost)
                        .min(Comparator.comparingDouble(crossSection -> crossSection.getCurrentCapacity() - Iost)).get().getCurrentCapacity();

                Double przekroj = conductorCrossSections.stream()
                        .filter(crossSection -> crossSection.getCurrentCapacity().equals(prad))
                        .findFirst().get().getValue();

                //Teraz mamy prąd obciążeniowy więc wyciągamy przekroj i doklejamy do reponsa???

                CableOutput cableOutput = cableDataMapper.mapToCableOutput(cable);
                cableOutput.setMaterial(MATERIAL_TYPE_MAPPING.get(input.getMaterial()));
                cableOutput.setIsolation(ISOLATION_TYPE_MAPPING.get(input.getIsolation()));
                cableOutput.setPrzekroj(przekroj.toString());


                filteredCables.add(cableOutput);



            }
        }

        return  filteredCables;
    }

    private boolean filterByMetalType(String cableType, String metalType) {
        // Przemapuj metalType przy użyciu mapy
        String mappedMetalType = METAL_TYPE_MAPPING.get(metalType);

        if ("Cu".equals(mappedMetalType)) {
            return cableType.matches("^(YDY|YDYp|YKY|YKXS|N2XH).*$");
        } else if ("Al".equals(mappedMetalType)) {
            return cableType.equals("YAKXS");
        }
        return false;
    }

    private boolean filterByInsulationType(String cableType, String insulationType) {
        if (insulationType.equals("a")) {
            return (cableType.contains("YDY") || cableType.contains("YDYp") || cableType.contains("YKY"));
        } else if (insulationType.equals("b")) {
            return (cableType.contains("YKXS") || cableType.contains("YAKXS"));
        } else if (insulationType.equals("c")) {
            return cableType.contains("N2XH");
        }
        return false;
    }





    private boolean filterByNumberOfLoadedCores(int numberOfCoresLoaded, String coresLoaded) {
        // Mapa tłumaczenia literkowych wartości na liczby
        Map<String, Integer> coresMapping = Map.of("a", 2, "b", 3, "c", 3);

        // Pobierz odpowiednią liczbę rdzeni na podstawie literkowej wartości
        int expectedNumberOfCores = coresMapping.get(coresLoaded);

        // Porównaj z rzeczywistą liczbą rdzeni
        return numberOfCoresLoaded == expectedNumberOfCores;
    }

    private boolean filterByInstallationMethod(String cableTypeOfInstalation, String requiredTypeOfInstalation) {
        return cableTypeOfInstalation.equals(requiredTypeOfInstalation);
    }


}
