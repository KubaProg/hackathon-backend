package pl.nullpointers.hackathonbackend.Cable;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class CircuitCorrectionFactors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("numberOfCircuits")
    private int numberOfCircuits;

    @JsonProperty("ColumnA")
    private double columnA;

    @JsonProperty("ColumnB")
    private double columnB;

    @JsonProperty("ColumnC")
    private double columnC;


}
