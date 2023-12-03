package pl.nullpointers.hackathonbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.nullpointers.hackathonbackend.Cable.CableDataService;
import pl.nullpointers.hackathonbackend.counting.TemperatureCableFactors;

@SpringBootApplication
public class HackathonBackendApplication {

    @Autowired
    private CableDataService cableDataService;

    public static void main(String[] args) {
        SpringApplication.run(HackathonBackendApplication.class, args);

        TemperatureCableFactors temperatureCableFactors = new TemperatureCableFactors();

        // YDY 450/750V (izolacja PVC)
        temperatureCableFactors.addFactor("YDY 450/750V", 10, 1.22);
        temperatureCableFactors.addFactor("YDY 450/750V", 15, 1.17);
        temperatureCableFactors.addFactor("YDY 450/750V", 20, 1.12);
        temperatureCableFactors.addFactor("YDY 450/750V", 25, 1.06);
        temperatureCableFactors.addFactor("YDY 450/750V", 30, 1.0);
        temperatureCableFactors.addFactor("YDY 450/750V", 35, 0.94);
        temperatureCableFactors.addFactor("YDY 450/750V", 40, 0.87);
        temperatureCableFactors.addFactor("YDY 450/750V", 45, 0.79);
        temperatureCableFactors.addFactor("YDY 450/750V", 50, 0.71);
        temperatureCableFactors.addFactor("YDY 450/750V", 55, 0.61);
        temperatureCableFactors.addFactor("YDY 450/750V", 60, 0.5);

        // YDYp 450/750V (izolacja PVC)
        temperatureCableFactors.addFactor("YDYp 450/750V", 10, 1.22);
        temperatureCableFactors.addFactor("YDYp 450/750V", 15, 1.17);
        // Add factors for other temperatures...

        // YKY 0,6/1kV (izolacja PVC)
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 10, 1.22);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 15, 1.17);
        // Add factors for other temperatures...

        // YKXS 0,6/1kV (Izolacja XLPE)
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 10, 1.15);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 15, 1.12);
        // Add factors for other temperatures...

        // YAKXS 0,6/1kV (Izolacja XLPE)
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 10, 1.15);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 15, 1.12);
        // Add factors for other temperatures...

        // N2XH 0,6/1kV (Izoalcja XLPE)
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 10, 1.15);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 15, 1.12);
        // Add factors for other temperatures...

        // Retrieve and print a factor as an example
        String cableType = "YDY 450/750V";
        int temperature = 15;
        Double factor = temperatureCableFactors.getFactor(cableType, temperature);

        if (factor != null) {
            System.out.println("Factor for " + cableType + " at " + temperature + "°C: " + factor);
        } else {
            System.out.println("Factor not found for " + cableType + " at " + temperature + "°C");
        }
    }

    @Bean
    public CommandLineRunner loadData() {
        return args -> {
            String filePath = "src/main/resources/static/data.json";
            cableDataService.saveCableDataFromFile(filePath);
        };
    }


}
