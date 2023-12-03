package pl.nullpointers.hackathonbackend.circuit_correction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.nullpointers.hackathonbackend.Cable.CableData;

import java.util.List;


@Repository
public interface CircuitCorrectionRepository extends JpaRepository<CircuitCorrectionFactors, Long> {

//    List<CircuitCorrectionFactors> getByColumnA();
//    List<CircuitCorrectionFactors> getByColumnB();
//    List<CircuitCorrectionFactors> getByColumnC();

}
