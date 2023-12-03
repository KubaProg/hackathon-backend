package pl.nullpointers.hackathonbackend.counting;

import org.springframework.stereotype.Service;
import pl.nullpointers.hackathonbackend.inputHandler.Input;

import static java.lang.Math.sqrt;

@Service
public class CounterService {

    private TemperatureCableFactors temperatureCableFactors;
    private SoilTemperatureCableFactors soilTemperatureCableFactors;
    private ThermalResistanceFactors thermalResistanceFactors;

    public CounterService(TemperatureCableFactors temperatureCableFactors, SoilTemperatureCableFactors soilTemperatureCableFactors, ThermalResistanceFactors thermalResistanceFactors) {
        this.temperatureCableFactors = temperatureCableFactors;
        this.soilTemperatureCableFactors = soilTemperatureCableFactors;
        this.thermalResistanceFactors = thermalResistanceFactors;
    }

    public Double countIobl(Double power, Double voltage){
        if(voltage==230.0){
            return power / (voltage*0.8);
        }else{
            return power / ( sqrt(3) *voltage*0.8 );
        }
    }

    public Double extractVoltage(String phase){
        if(phase.equals("a")){
            return 230.0;
        }else{
            return 400.0;
        }
    }

    public Double countAirTemperatureFactor(String cableType, int temperature){
           return temperatureCableFactors.getFactor(cableType, temperature);
    }

    public Double countCircuitNumberFactor(){
        return 0.0;
    }

    public Double countSoilTemperatureFactor(String cableType, int temperature){
        return soilTemperatureCableFactors.getFactor(cableType, temperature);
    }

    public Double countSoilResistivityFactor(String cableType, Double resistivity ){
        return thermalResistanceFactors.getThermalResistanceFactor(cableType, "Izolacja XLPE", resistivity);
    }

    public Double countIost(Double Iost, Double airTemperatureFactor, Double soilTemperatureFactor, Double soilResistivityFactor){
        return Iost / (airTemperatureFactor*soilTemperatureFactor*soilResistivityFactor)*0.85;
    }

}
