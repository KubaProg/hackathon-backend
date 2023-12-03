package pl.nullpointers.hackathonbackend.circuit_correction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.nullpointers.hackathonbackend.Cable.CableData;


@Repository
public interface CircuitCorrectionRepository extends JpaRepository<CircuitCorrectionFactors, Long> {

}
