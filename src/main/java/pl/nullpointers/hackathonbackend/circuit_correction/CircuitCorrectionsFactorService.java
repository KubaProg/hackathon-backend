package pl.nullpointers.hackathonbackend.circuit_correction;

import org.springframework.stereotype.Service;
import pl.nullpointers.hackathonbackend.Cable.CableData;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CircuitCorrectionsFactorService {

    private final CircuitCorrectionRepository circuitCorrectionRepository;

    public CircuitCorrectionsFactorService(CircuitCorrectionRepository circuitCorrectionRepository) {
        this.circuitCorrectionRepository = circuitCorrectionRepository;
    }

    @PostConstruct
    public void importCircuitCorrectionFactors() {
        // Create CircuitCorrectionFactors objects
        List<CircuitCorrectionFactors> circuitCorrectionFactorsList = Arrays.asList(
                new CircuitCorrectionFactors("1", "1.0", "1.0", "1.0"),
                new CircuitCorrectionFactors("2", "0.8", "0.88", "0.87"),
                new CircuitCorrectionFactors("3", "0.7", "0.82", "0.82"),
                new CircuitCorrectionFactors("4", "0.65", "0.77", "0.8"),
                new CircuitCorrectionFactors("5", "0.6", "0.75", "0.8"),
                new CircuitCorrectionFactors("6", "0.57", "0.73", "0.79"),
                new CircuitCorrectionFactors("7", "0.54", "0.73", "0.79"),
                new CircuitCorrectionFactors("8", "0.52", "0.72", "0.78"),
                new CircuitCorrectionFactors("9", "0.5", "0.72", "0.78")
        );

        // Save to the database
        circuitCorrectionRepository.saveAll(circuitCorrectionFactorsList);
    }

//    public String getCorrectionfactorsByNumberOfCables(int numberOfCables, CableData cableData) {
//
//        String installationMethod = cableData.getInstallationMethod();
//        String column = "";
//
//        if (installationMethod.contains("wielożyłowy")) {
//            column = "B";
//
//        } else if (installationMethod.contains("jednożyłowych") ) {
//            column = "A";
//        } else {
//            column = "C";
//        }
//
//        List<CircuitCorrectionFactors> rows = new ArrayList<>();
//
//        switch (column.toUpperCase()) {
//            case "A":
//                rows = circuitCorrectionRepository.getByColumnA();
//                return rows.get(numberOfCables - 1).getColumnA();
//            case "B":
//                rows = circuitCorrectionRepository.getByColumnB();
//                return rows.get(numberOfCables - 1).getColumnB();
//            case "C":
//                rows = circuitCorrectionRepository.getByColumnC();
//                return rows.get(numberOfCables - 1).getColumnC();
//            default:
//                return "";
//        }
//
//
//
//    }

}
