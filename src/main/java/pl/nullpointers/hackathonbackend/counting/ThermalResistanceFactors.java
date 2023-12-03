package pl.nullpointers.hackathonbackend.counting;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ThermalResistanceFactors {
    private Map<String, Map<Double, Map<String, Double>>> thermalResistanceFactors;

    public ThermalResistanceFactors() {
        thermalResistanceFactors = new HashMap<>();
        initializeThermalResistanceFactors();
    }

    private void initializeThermalResistanceFactors() {
        // Resistivity factors for YKY 0,6/1kV (izolacja PVC)
        addThermalResistanceFactor("YKY 0,6/1kV", 0.5, "izolacja PVC", 1.08);
        addThermalResistanceFactor("YKY 0,6/1kV", 0.7, "izolacja PVC", 1.02);
        addThermalResistanceFactor("YKY 0,6/1kV", 1.0, "izolacja PVC", 1.0);
        addThermalResistanceFactor("YKY 0,6/1kV", 1.5, "izolacja PVC", 0.93);
        addThermalResistanceFactor("YKY 0,6/1kV", 2.0, "izolacja PVC", 0.89);
        addThermalResistanceFactor("YKY 0,6/1kV", 2.5, "izolacja PVC", 0.85);
        addThermalResistanceFactor("YKY 0,6/1kV", 3.0, "izolacja PVC", 0.81);

        // Resistivity factors for YKXS 0,6/1kV (Izolacja XLPE)
        addThermalResistanceFactor("YKXS 0,6/1kV", 0.5, "Izolacja XLPE", 1.08);
        addThermalResistanceFactor("YKXS 0,6/1kV", 0.7, "Izolacja XLPE", 1.25);
        addThermalResistanceFactor("YKXS 0,6/1kV", 1.0, "Izolacja XLPE", 1.0);
        addThermalResistanceFactor("YKXS 0,6/1kV", 1.5, "Izolacja XLPE", 0.93);
        addThermalResistanceFactor("YKXS 0,6/1kV", 2.0, "Izolacja XLPE", 0.89);
        addThermalResistanceFactor("YKXS 0,6/1kV", 2.5, "Izolacja XLPE", 0.85);
        addThermalResistanceFactor("YKXS 0,6/1kV", 3.0, "Izolacja XLPE", 0.81);

        // Resistivity factors for YAKXS 0,6/1kV (Izolacja XLPE)
        addThermalResistanceFactor("YAKXS 0,6/1kV", 0.5, "Izolacja XLPE", 1.08);
        addThermalResistanceFactor("YAKXS 0,6/1kV", 0.7, "Izolacja XLPE", 1.25);
        addThermalResistanceFactor("YAKXS 0,6/1kV", 1.0, "Izolacja XLPE", 1.0);
        addThermalResistanceFactor("YAKXS 0,6/1kV", 1.5, "Izolacja XLPE", 0.93);
        addThermalResistanceFactor("YAKXS 0,6/1kV", 2.0, "Izolacja XLPE", 0.89);
        addThermalResistanceFactor("YAKXS 0,6/1kV", 2.5, "Izolacja XLPE", 0.85);
        addThermalResistanceFactor("YAKXS 0,6/1kV", 3.0, "Izolacja XLPE", 0.81);
    }

    private void addThermalResistanceFactor(String cableType, double depth, String insulation, double factor) {
        thermalResistanceFactors
                .computeIfAbsent(cableType, k -> new HashMap<>())
                .computeIfAbsent(depth, k -> new HashMap<>())
                .put(insulation, factor);
    }


    public Double getThermalResistanceFactor(String cableType, Double insulation) {
        return thermalResistanceFactors
                .getOrDefault(cableType, new HashMap<>())
                .values()
                .stream()
                .flatMap(innerMap -> innerMap.entrySet().stream())
                .filter(entry -> entry.getKey().equals(insulation))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }


}
