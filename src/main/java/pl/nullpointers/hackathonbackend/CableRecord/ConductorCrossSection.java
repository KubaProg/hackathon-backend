package pl.nullpointers.hackathonbackend.CableRecord;

import javax.persistence.*;

@Entity
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
