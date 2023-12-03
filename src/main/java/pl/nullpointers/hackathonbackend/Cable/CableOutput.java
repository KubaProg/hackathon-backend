package pl.nullpointers.hackathonbackend.Cable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CableOutput {



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

    private String material;
    private String isolation;



    // wartosć Przekróju żyły
//    private String conductorCrossSections;


    // add attributes
}
