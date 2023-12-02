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

}
