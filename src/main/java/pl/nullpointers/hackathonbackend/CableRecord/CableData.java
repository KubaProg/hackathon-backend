package pl.nullpointers.hackathonbackend.CableRecord;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class CableData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // rodzaj żyły
    private String cableType;

    // Obwód
    private String circuit;

    // Liczba żył
    private int numberOfCores;

    // Liczba żył obciążonych prądowo
    private int numberOfCoresLoaded;

    // Sposób instalacji
    private String installationMethod;

    // Metoda referencyjna
    private String referenceMethod;

    // Przekrój żyły (relationship to another entity)
    @OneToMany(mappedBy = "cableData")
    private List<ConductorCrossSection> conductorCrossSections;


}
