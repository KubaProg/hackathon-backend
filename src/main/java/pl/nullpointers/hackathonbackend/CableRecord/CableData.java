package pl.nullpointers.hackathonbackend.CableRecord;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CableData {
//    przewód/kabel
////            obwód
////    liczba żył
////    liczba żył obciążonych prądowo
////    sposób instalacji
////    metoda referencyjna
////
////
////    przekrój żyły

    // Przewód/kabel

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
