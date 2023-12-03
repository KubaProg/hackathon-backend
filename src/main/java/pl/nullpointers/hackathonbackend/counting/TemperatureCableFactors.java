package pl.nullpointers.hackathonbackend.counting;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TemperatureCableFactors {

    private Map<String, Map<Integer, Double>> factors;

    public TemperatureCableFactors() {
        factors = new HashMap<>();

        addFactor("YDY 450/750 V", 10, 1.22);
        addFactor("YDY 450/750 V", 15, 1.17);
        addFactor("YDY 450/750 V", 20, 1.12);
        addFactor("YDY 450/750 V", 25, 1.06);
        addFactor("YDY 450/750 V", 30, 1.0);
        addFactor("YDY 450/750 V", 35, 0.94);
        addFactor("YDY 450/750 V", 40, 0.87);
        addFactor("YDY 450/750 V", 45, 0.79);
        addFactor("YDY 450/750 V", 50, 0.71);
        addFactor("YDY 450/750 V", 55, 0.61);
        addFactor("YDY 450/750 V", 60, 0.5);

        // YDYp 450/750V (izolacja PVC)
        addFactor("YDYp 450/750 V", 10, 1.22);
        addFactor("YDYp 450/750 V", 15, 1.17);
        addFactor("YDYp 450/750 V", 20, 1.12);
        addFactor("YDYp 450/750 V", 25, 1.06);
        addFactor("YDYp 450/750 V", 30, 1.0);
        addFactor("YDYp 450/750 V", 35, 0.94);
        addFactor("YDYp 450/750 V", 40, 0.87);
        addFactor("YDYp 450/750 V", 45, 0.79);
        addFactor("YDYp 450/750 V", 50, 0.71);
        addFactor("YDYp 450/750 V", 55, 0.61);
        addFactor("YDYp 450/750 V", 60, 0.5);
        addFactor("YDYp 450/750 V", 65, 0.0);  // Fill in the actual value
        addFactor("YDYp 450/750 V", 70, 0.0);  // Fill in the actual value
        addFactor("YDYp 450/750 V", 75, 0.0);  // Fill in the actual value
        addFactor("YDYp 450/750 V", 80, 0.0);  // Fill in the actual value

        // YKY 0,6/1kV (izolacja PVC)
        addFactor("YKY 0,6/1kV", 10, 1.22);
        addFactor("YKY 0,6/1kV", 15, 1.17);
        addFactor("YKY 0,6/1kV", 20, 1.12);
        addFactor("YKY 0,6/1kV", 25, 1.06);
        addFactor("YKY 0,6/1kV", 30, 1.0);
        addFactor("YKY 0,6/1kV", 35, 0.94);
        addFactor("YKY 0,6/1kV", 40, 0.87);
        addFactor("YKY 0,6/1kV", 45, 0.79);
        addFactor("YKY 0,6/1kV", 50, 0.71);
        addFactor("YKY 0,6/1kV", 55, 0.61);
        addFactor("YKY 0,6/1kV", 60, 0.5);
        addFactor("YKY 0,6/1kV", 65, 0.0);  // Fill in the actual value
        addFactor("YKY 0,6/1kV", 70, 0.0);  // Fill in the actual value
        addFactor("YKY 0,6/1kV", 75, 0.0);  // Fill in the actual value
        addFactor("YKY 0,6/1kV", 80, 0.0);

        // YKXS 0,6/1kV (Izolacja XLPE)
        addFactor("YKXS 0,6/1kV", 10, 1.15);
        addFactor("YKXS 0,6/1kV", 15, 1.12);
        addFactor("YKXS 0,6/1kV", 20, 1.08);
        addFactor("YKXS 0,6/1kV", 25, 1.04);
        addFactor("YKXS 0,6/1kV", 30, 1.0);
        addFactor("YKXS 0,6/1kV", 35, 0.96);
        addFactor("YKXS 0,6/1kV", 40, 0.91);
        addFactor("YKXS 0,6/1kV", 45, 0.87);
        addFactor("YKXS 0,6/1kV", 50, 0.82);
        addFactor("YKXS 0,6/1kV", 55, 0.76);
        addFactor("YKXS 0,6/1kV", 60, 0.71);
        addFactor("YKXS 0,6/1kV", 65, 0.65);
        addFactor("YKXS 0,6/1kV", 70, 0.58);
        addFactor("YKXS 0,6/1kV", 75, 0.5);
        addFactor("YKXS 0,6/1kV", 80, 0.41);

        // YAKXS 0,6/1kV (Izolacja XLPE)
        addFactor("YAKXS 0,6/1kV", 10, 1.15);
        addFactor("YAKXS 0,6/1kV", 15, 1.12);
        addFactor("YAKXS 0,6/1kV", 20, 1.08);
        addFactor("YAKXS 0,6/1kV", 25, 1.04);
        addFactor("YAKXS 0,6/1kV", 30, 1.0);
        addFactor("YAKXS 0,6/1kV", 35, 0.96);
        addFactor("YAKXS 0,6/1kV", 40, 0.91);
        addFactor("YAKXS 0,6/1kV", 45, 0.87);
        addFactor("YAKXS 0,6/1kV", 50, 0.82);
        addFactor("YAKXS 0,6/1kV", 55, 0.76);
        addFactor("YAKXS 0,6/1kV", 60, 0.71);
        addFactor("YAKXS 0,6/1kV", 65, 0.65);
        addFactor("YAKXS 0,6/1kV", 70, 0.58);
        addFactor("YAKXS 0,6/1kV", 75, 0.5);
        addFactor("YAKXS 0,6/1kV", 80, 0.41);

        // N2XH 0,6/1kV (Izoalcja XLPE)
        addFactor("N2XH 0,6/1kV", 10, 1.15);
        addFactor("N2XH 0,6/1kV", 15, 1.12);
        addFactor("N2XH 0,6/1kV", 20, 1.08);
        addFactor("N2XH 0,6/1kV", 25, 1.04);
        addFactor("N2XH 0,6/1kV", 30, 1.0);
        addFactor("N2XH 0,6/1kV", 35, 0.96);
        addFactor("N2XH 0,6/1kV", 40, 0.91);
        addFactor("N2XH 0,6/1kV", 45, 0.87);
        addFactor("N2XH 0,6/1kV", 50, 0.82);
        addFactor("N2XH 0,6/1kV", 55, 0.76);
        addFactor("N2XH 0,6/1kV", 60, 0.71);
        addFactor("N2XH 0,6/1kV", 65, 0.65);
        addFactor("N2XH 0,6/1kV", 70, 0.58);
        addFactor("N2XH 0,6/1kV", 75, 0.5);
        addFactor("N2XH 0,6/1kV", 80, 0.41);

    }

    public void addFactor(String cableType, int temperature, double factor) {
        // If the cable type doesn't exist in the map, create a new entry
        factors.putIfAbsent(cableType, new HashMap<>());
        // Add the factor for the specified temperature
        factors.get(cableType).put(temperature, factor);
    }

    public Double getFactor(String cableType, int temperature) {
        // Retrieve the factor for the specified temperature and cable type
        Map<Integer, Double> cableFactors = factors.get(cableType);
        if (cableFactors != null) {
            return cableFactors.get(temperature);
        }
        return null; // Cable type or temperature not found
    }

}
