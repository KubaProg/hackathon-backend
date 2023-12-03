package pl.nullpointers.hackathonbackend.counting;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SoilTemperatureCableFactors {

    private Map<String, Map<Integer, Double>> factors;

    public SoilTemperatureCableFactors() {
        this.factors = new HashMap<>();
    }

    public void addFactor(String cableType, int temperature, double factor) {
        factors.computeIfAbsent(cableType, k -> new HashMap<>()).put(temperature, factor);
    }

    public Double getFactor(String cableType, int temperature) {
        return factors.getOrDefault(cableType, new HashMap<>()).get(temperature);
    }

}
