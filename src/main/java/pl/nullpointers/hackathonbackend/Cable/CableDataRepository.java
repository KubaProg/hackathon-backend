package pl.nullpointers.hackathonbackend.Cable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CableDataRepository extends JpaRepository<CableData, Long> {

}
