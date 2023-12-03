package pl.nullpointers.hackathonbackend.counting;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class TemperatureCableFactors {

    private Map<String, Map<Integer, Double>> factors;

    public TemperatureCableFactors() {
        factors = new HashMap<>();
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
