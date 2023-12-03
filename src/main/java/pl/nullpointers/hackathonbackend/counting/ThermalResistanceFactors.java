package pl.nullpointers.hackathonbackend.counting;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class ThermalResistanceFactors {

    private Map<String, Map<String, Double>> thermalResistanceFactors;

    public ThermalResistanceFactors() {
        thermalResistanceFactors = new HashMap<>();
        initializeThermalResistanceFactors();
    }

    private void initializeThermalResistanceFactors() {
        // Add your initial data here based on the provided values
        addThermalResistanceFactor("YKY 0,6/1kV", "Izolacja XLPE", 0.5, 1.08);
        addThermalResistanceFactor("YKY 0,6/1kV", "Izolacja XLPE", 0.7, 1.02);
        addThermalResistanceFactor("YKY 0,6/1kV", "Izolacja XLPE", 1.0, 1.0);
        addThermalResistanceFactor("YKY 0,6/1kV", "Izolacja XLPE", 1.5, 0.93);
        addThermalResistanceFactor("YKY 0,6/1kV", "Izolacja XLPE", 2.0, 0.89);
        addThermalResistanceFactor("YKY 0,6/1kV", "Izolacja XLPE", 2.5, 0.85);
        addThermalResistanceFactor("YKY 0,6/1kV", "Izolacja XLPE", 3.0, 0.81);


        addThermalResistanceFactor("YKXS 0,6/1kV", "Izolacja XLPE", 0.5, 1.08);
        addThermalResistanceFactor("YKXS 0,6/1kV", "Izolacja XLPE", 0.7, 1.02);
        addThermalResistanceFactor("YKXS 0,6/1kV", "Izolacja XLPE", 1.0, 1.0);
        addThermalResistanceFactor("YKXS 0,6/1kV", "Izolacja XLPE", 1.5, 0.93);
        addThermalResistanceFactor("YKXS 0,6/1kV", "Izolacja XLPE", 2.0, 0.89);
        addThermalResistanceFactor("YKXS 0,6/1kV", "Izolacja XLPE", 2.5, 0.85);
        addThermalResistanceFactor("YKXS 0,6/1kV", "Izolacja XLPE", 3.0, 0.81);
        // Add other entries...
        addThermalResistanceFactor("YAKXS 0,6/1kV", "Izolacja XLPE", 0.5, 1.25);
        addThermalResistanceFactor("YAKXS 0,6/1kV", "Izolacja XLPE", 0.7, 1.08);
        addThermalResistanceFactor("YAKXS 0,6/1kV", "Izolacja XLPE", 1.0, 1.0);
        addThermalResistanceFactor("YAKXS 0,6/1kV", "Izolacja XLPE", 1.5, 0.85);
        addThermalResistanceFactor("YAKXS 0,6/1kV", "Izolacja XLPE", 2.0, 0.75);
        addThermalResistanceFactor("YAKXS 0,6/1kV", "Izolacja XLPE", 2.5, 0.67);
        addThermalResistanceFactor("YAKXS 0,6/1kV", "Izolacja XLPE", 3.0, 0.6);


    }

    private void addThermalResistanceFactor(String cableType, String insulation, double depth, double factor) {
        thermalResistanceFactors
                .computeIfAbsent(cableType, k -> new HashMap<>())
                .put(insulation + "_" + depth, factor);
    }

    public Double getThermalResistanceFactor(String cableType, String insulation, double depth) {
        return thermalResistanceFactors
                .getOrDefault(cableType, new HashMap<>())
                .get(insulation + "_" + depth);
    }

}
