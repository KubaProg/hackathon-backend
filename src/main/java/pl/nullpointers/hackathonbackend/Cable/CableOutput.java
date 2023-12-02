package pl.nullpointers.hackathonbackend.Cable;


import java.util.List;

public class CableOutput {


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

    // wartosć Przekróju żyły
    private String conductorCrossSections;
}
