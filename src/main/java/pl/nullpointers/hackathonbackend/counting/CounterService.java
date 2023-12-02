package pl.nullpointers.hackathonbackend.counting;

import org.springframework.stereotype.Service;

import static java.lang.Math.sqrt;

@Service
public class CounterService {

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

    public Double countAirTemperatureFactor(Double temperature){
        if(temperature!=30){

        }
        return 0.0;
    }

    public Double countCircuitNumberFactor(){
        return 0.0;
    }

    public Double countSoilTemperatureFactor(Double temperature){
        if(temperature!=20){

        }
        return 0.0;
    }

    public Double countSoilResistivityFactor(Double temperature){
        if(temperature!=0){

        }
        return 0.0;
    }

}
