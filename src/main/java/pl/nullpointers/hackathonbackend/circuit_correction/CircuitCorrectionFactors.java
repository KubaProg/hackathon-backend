package pl.nullpointers.hackathonbackend.circuit_correction;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
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
    private String numberOfCircuits;

    @JsonProperty("ColumnA")
    private String columnA;

    @JsonProperty("ColumnB")
    private String columnB;

    @JsonProperty("ColumnC")
    private String columnC;

    public CircuitCorrectionFactors(String numberOfCircuits, String columnA, String columnB, String columnC) {
        this.numberOfCircuits = numberOfCircuits;
        this.columnA = columnA;
        this.columnB = columnB;
        this.columnC = columnC;
    }

    public CircuitCorrectionFactors() {

    }
}
