package pl.nullpointers.hackathonbackend.Filter;

import org.springframework.stereotype.Service;
import pl.nullpointers.hackathonbackend.Cable.CableData;
import pl.nullpointers.hackathonbackend.Cable.CableDataMapper;
import pl.nullpointers.hackathonbackend.Cable.CableDataRepository;
import pl.nullpointers.hackathonbackend.Cable.CableOutput;
import pl.nullpointers.hackathonbackend.inputHandler.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FilterService {



    private static final Map<String, String> METAL_TYPE_MAPPING = new HashMap<>();
    private CableDataRepository cableDataRepository;
    private CableDataMapper cableDataMapper;

    public FilterService(CableDataRepository cableDataRepository, CableDataMapper cableDataMapper) {
        this.cableDataRepository = cableDataRepository;
        this.cableDataMapper = cableDataMapper;
    }

    static {
        METAL_TYPE_MAPPING.put("a", "Cu");
        METAL_TYPE_MAPPING.put("b", "Al");


    }




    public List<CableOutput> filterCables(Input input) {

        List<CableData> cables = cableDataRepository.findAll();
        List<CableData> filteredCables = new ArrayList<>();

        for (CableData cable : cables) {
            if (filterByMetalType(cable.getCableType(), input.getMaterial())
                    && filterByInsulationType(cable.getCableType(), input.getIsolation())
                    && filterByNumberOfLoadedCores(cable.getNumberOfCoresLoaded(), input.getCoresLoaded())
                    && filterByInstallationMethod(cable.getReferenceMethod(), input.getTypeOfInstalation())) {
                filteredCables.add(cable);
            }
        }

        return  cableDataMapper.mapToListOfCableOutput(filteredCables);
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
            return cableType.contains("YKY");
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
