package pl.nullpointers.hackathonbackend.Cable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class CableData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("cable")
    private String cableType;

    @JsonProperty("circuit")
    private String circuit;

    @JsonProperty("number_of_cores")
    private int numberOfCores;

    @JsonProperty("number_of_current_carrying_cores")
    private int numberOfCoresLoaded;

    @JsonProperty("installation_method")
    private String installationMethod;

    @JsonProperty("reference_method")
    private String referenceMethod;

    @JsonProperty("current_capacity")
    @OneToMany(mappedBy = "cableData")
    @JsonManagedReference
    private List<ConductorCrossSection> conductorCrossSections;


}
