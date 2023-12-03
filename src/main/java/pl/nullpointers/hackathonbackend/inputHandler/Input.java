package pl.nullpointers.hackathonbackend.inputHandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Input {
    private String material;
    private String isolation;

    private String coresLoaded;

    private String typeOfInstalation;

    private String temperature;

    private String soilResistivity;

    private String power;

    private Double cos = 0.8;


}
