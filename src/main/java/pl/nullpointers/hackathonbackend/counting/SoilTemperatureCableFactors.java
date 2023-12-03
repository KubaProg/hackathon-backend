package pl.nullpointers.hackathonbackend.counting;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SoilTemperatureCableFactors {

    private Map<String, Map<Integer, Double>> factors;

    public SoilTemperatureCableFactors() {
        this.factors = new HashMap<>();


        addFactor("YDY 450/750V", 10, 0.0);
        addFactor("YDY 450/750V", 15, 0.0);
        addFactor("YDY 450/750V", 20, 0.0);
        addFactor("YDY 450/750V", 25, 0.0);
        addFactor("YDY 450/750V", 30, 0.0);
        addFactor("YDY 450/750V", 35, 0.0);
        addFactor("YDY 450/750V", 40, 0.0);
        addFactor("YDY 450/750V", 45, 0.0);
        addFactor("YDY 450/750V", 50, 0.0);
        addFactor("YDY 450/750V", 55, 0.0);
        addFactor("YDY 450/750V", 60, 0.0);
        addFactor("YDY 450/750V", 65, 0.0);
        addFactor("YDY 450/750V", 70, 0.0);
        addFactor("YDY 450/750V", 75, 0.0);
        addFactor("YDY 450/750V", 80, 0.0);

        // Add factors for YDYp 450/750V
        addFactor("YDYp 450/750V", 10, 0.0);
        addFactor("YDYp 450/750V", 15, 0.0);
        addFactor("YDYp 450/750V", 20, 0.0);
        addFactor("YDYp 450/750V", 25, 0.0);
        addFactor("YDYp 450/750V", 30, 0.0);
        addFactor("YDYp 450/750V", 35, 0.0);
        addFactor("YDYp 450/750V", 40, 0.0);
        addFactor("YDYp 450/750V", 45, 0.0);
        addFactor("YDYp 450/750V", 50, 0.0);
        addFactor("YDYp 450/750V", 55, 0.0);
        addFactor("YDYp 450/750V", 60, 0.0);
        addFactor("YDYp 450/750V", 65, 0.0);
        addFactor("YDYp 450/750V", 70, 0.0);
        addFactor("YDYp 450/750V", 75, 0.0);
        addFactor("YDYp 450/750V", 80, 0.0);

        // Add factors for YKY 0,6/1kV
        addFactor("YKY 0,6/1kV", 10, 1.1);
        addFactor("YKY 0,6/1kV", 15, 1.05);
        addFactor("YKY 0,6/1kV", 20, 1.0);
        addFactor("YKY 0,6/1kV", 25, 0.95);
        addFactor("YKY 0,6/1kV", 30, 0.89);
        addFactor("YKY 0,6/1kV", 35, 0.84);
        addFactor("YKY 0,6/1kV", 40, 0.77);
        addFactor("YKY 0,6/1kV", 45, 0.71);
        addFactor("YKY 0,6/1kV", 50, 0.63);
        addFactor("YKY 0,6/1kV", 55, 0.55);
        addFactor("YKY 0,6/1kV", 60, 0.45);
        addFactor("YKY 0,6/1kV", 65, 0.0);
        addFactor("YKY 0,6/1kV", 70, 0.0);
        addFactor("YKY 0,6/1kV", 75, 0.0);
        addFactor("YKY 0,6/1kV", 80, 0.0);

        // Add factors for YKXS 0,6/1kV
        addFactor("YKXS 0,6/1kV", 10, 1.07);
        addFactor("YKXS 0,6/1kV", 15, 1.04);
        addFactor("YKXS 0,6/1kV", 20, 1.0);
        addFactor("YKXS 0,6/1kV", 25, 0.96);
        addFactor("YKXS 0,6/1kV", 30, 0.93);
        addFactor("YKXS 0,6/1kV", 35, 0.89);
        addFactor("YKXS 0,6/1kV", 40, 0.85);
        addFactor("YKXS 0,6/1kV", 45, 0.8);
        addFactor("YKXS 0,6/1kV", 50, 0.76);
        addFactor("YKXS 0,6/1kV", 55, 0.71);
        addFactor("YKXS 0,6/1kV", 60, 0.65);
        addFactor("YKXS 0,6/1kV", 65, 0.6);
        addFactor("YKXS 0,6/1kV", 70, 0.53);
        addFactor("YKXS 0,6/1kV", 75, 0.46);
        addFactor("YKXS 0,6/1kV", 80, 0.38);

        // Add factors for YAKXS 0,6/1kV
        addFactor("YAKXS 0,6/1kV", 10, 1.07);
        addFactor("YAKXS 0,6/1kV", 15, 1.04);
        addFactor("YAKXS 0,6/1kV", 20, 1.0);
        addFactor("YAKXS 0,6/1kV", 25, 0.96);
        addFactor("YAKXS 0,6/1kV", 30, 0.93);
        addFactor("YAKXS 0,6/1kV", 35, 0.89);
        addFactor("YAKXS 0,6/1kV", 40, 0.85);
        addFactor("YAKXS 0,6/1kV", 45, 0.8);
        addFactor("YAKXS 0,6/1kV", 50, 0.76);
        addFactor("YAKXS 0,6/1kV", 55, 0.71);
        addFactor("YAKXS 0,6/1kV", 60, 0.65);
        addFactor("YAKXS 0,6/1kV", 65, 0.6);
        addFactor("YAKXS 0,6/1kV", 70, 0.53);
        addFactor("YAKXS 0,6/1kV", 75, 0.46);
        addFactor("YAKXS 0,6/1kV", 80, 0.38);

    }

    public void addFactor(String cableType, int temperature, double factor) {
        factors.computeIfAbsent(cableType, k -> new HashMap<>()).put(temperature, factor);
    }

    public Double getFactor(String cableType, int temperature) {
        return factors.getOrDefault(cableType, new HashMap<>()).get(temperature);
    }

}
