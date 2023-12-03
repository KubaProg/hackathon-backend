package pl.nullpointers.hackathonbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.nullpointers.hackathonbackend.Cable.CableDataService;
import pl.nullpointers.hackathonbackend.counting.SoilTemperatureCableFactors;
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
        // Add factors for YDYp 450/750V (izolacja PVC)
        temperatureCableFactors.addFactor("YDYp 450/750V", 10, 1.22);
        temperatureCableFactors.addFactor("YDYp 450/750V", 15, 1.17);
        temperatureCableFactors.addFactor("YDYp 450/750V", 20, 1.12);
        temperatureCableFactors.addFactor("YDYp 450/750V", 25, 1.06);
        temperatureCableFactors.addFactor("YDYp 450/750V", 30, 1.0);
        temperatureCableFactors.addFactor("YDYp 450/750V", 35, 0.94);
        temperatureCableFactors.addFactor("YDYp 450/750V", 40, 0.87);
        temperatureCableFactors.addFactor("YDYp 450/750V", 45, 0.79);
        temperatureCableFactors.addFactor("YDYp 450/750V", 50, 0.71);
        temperatureCableFactors.addFactor("YDYp 450/750V", 55, 0.61);
        temperatureCableFactors.addFactor("YDYp 450/750V", 60, 0.5);
        temperatureCableFactors.addFactor("YDYp 450/750V", 65, 0.0);  // Fill in the actual value
        temperatureCableFactors.addFactor("YDYp 450/750V", 70, 0.0);  // Fill in the actual value
        temperatureCableFactors.addFactor("YDYp 450/750V", 75, 0.0);  // Fill in the actual value
        temperatureCableFactors.addFactor("YDYp 450/750V", 80, 0.0);  // Fill in the actual value
        // Add factors for other temperatures...

        // YKY 0,6/1kV (izolacja PVC)
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 10, 1.22);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 15, 1.17);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 20, 1.12);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 25, 1.06);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 30, 1.0);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 35, 0.94);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 40, 0.87);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 45, 0.79);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 50, 0.71);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 55, 0.61);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 60, 0.5);
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 65, 0.0);  // Fill in the actual value
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 70, 0.0);  // Fill in the actual value
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 75, 0.0);  // Fill in the actual value
        temperatureCableFactors.addFactor("YKY 0,6/1kV", 80, 0.0);
        // Add factors for other temperatures...

        // Add factors for YKXS 0,6/1kV (Izolacja XLPE)
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 10, 1.15);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 15, 1.12);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 20, 1.08);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 25, 1.04);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 30, 1.0);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 35, 0.96);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 40, 0.91);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 45, 0.87);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 50, 0.82);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 55, 0.76);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 60, 0.71);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 65, 0.65);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 70, 0.58);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 75, 0.5);
        temperatureCableFactors.addFactor("YKXS 0,6/1kV", 80, 0.41);
        // Add factors for other temperatures...

        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 10, 1.15);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 15, 1.12);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 20, 1.08);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 25, 1.04);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 30, 1.0);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 35, 0.96);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 40, 0.91);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 45, 0.87);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 50, 0.82);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 55, 0.76);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 60, 0.71);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 65, 0.65);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 70, 0.58);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 75, 0.5);
        temperatureCableFactors.addFactor("YAKXS 0,6/1kV", 80, 0.41);
        // Add factors for other temperatures...

        // N2XH 0,6/1kV (Izoalcja XLPE)
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 10, 1.15);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 15, 1.12);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 20, 1.08);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 25, 1.04);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 30, 1.0);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 35, 0.96);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 40, 0.91);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 45, 0.87);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 50, 0.82);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 55, 0.76);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 60, 0.71);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 65, 0.65);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 70, 0.58);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 75, 0.5);
        temperatureCableFactors.addFactor("N2XH 0,6/1kV", 80, 0.41);








        SoilTemperatureCableFactors soilTemperatureCableFactors = new SoilTemperatureCableFactors();

        soilTemperatureCableFactors.addFactor("YDY 450/750V", 10, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 15, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 20, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 25, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 30, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 35, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 40, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 45, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 50, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 55, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 60, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 65, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 70, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 75, 0.0);
        soilTemperatureCableFactors.addFactor("YDY 450/750V", 80, 0.0);

// Add factors for YDYp 450/750V
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 10, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 15, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 20, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 25, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 30, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 35, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 40, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 45, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 50, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 55, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 60, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 65, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 70, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 75, 0.0);
        soilTemperatureCableFactors.addFactor("YDYp 450/750V", 80, 0.0);

        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 10, 1.1);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 15, 1.05);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 20, 1.0);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 25, 0.95);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 30, 0.89);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 35, 0.84);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 40, 0.77);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 45, 0.71);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 50, 0.63);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 55, 0.55);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 60, 0.45);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 65, 0.0);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 70, 0.0);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 75, 0.0);
        soilTemperatureCableFactors.addFactor("YKY 0,6/1kV", 80, 0.0);

// Add factors for YKXS 0,6/1kV
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 10, 1.07);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 15, 1.04);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 20, 1.0);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 25, 0.96);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 30, 0.93);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 35, 0.89);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 40, 0.85);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 45, 0.8);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 50, 0.76);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 55, 0.71);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 60, 0.65);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 65, 0.6);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 70, 0.53);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 75, 0.46);
        soilTemperatureCableFactors.addFactor("YKXS 0,6/1kV", 80, 0.38);

// Add factors for YAKXS 0,6/1kV
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 10, 1.07);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 15, 1.04);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 20, 1.0);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 25, 0.96);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 30, 0.93);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 35, 0.89);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 40, 0.85);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 45, 0.8);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 50, 0.76);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 55, 0.71);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 60, 0.65);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 65, 0.6);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 70, 0.53);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 75, 0.46);
        soilTemperatureCableFactors.addFactor("YAKXS 0,6/1kV", 80, 0.38);





    }

    @Bean
    public CommandLineRunner loadData() {
        return args -> {
            String filePath = "src/main/resources/static/data.json";
            cableDataService.saveCableDataFromFile(filePath);
        };
    }


}
