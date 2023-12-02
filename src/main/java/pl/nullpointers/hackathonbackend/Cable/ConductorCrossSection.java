package pl.nullpointers.hackathonbackend.Cable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @JsonProperty("currentCapacity")
    private Double value;

    @JsonProperty("value")
    private Double currentCapacity;

    @ManyToOne
    @JoinColumn(name = "cable_data_id")
    @JsonBackReference  // Designates this side as the "backward" side
    private CableData cableData;


}
