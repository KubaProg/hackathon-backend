package pl.nullpointers.hackathonbackend.Cable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ConductorCrossSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double value;

    private Double currentCapacity;

    @ManyToOne
    @JoinColumn(name = "cable_data_id")
    private CableData cableData;


}
