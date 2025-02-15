package com.debugueandoideas;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public abstract class Stone {

    String color;
    String name;
    String location;
    String energyLebel;
    String numberOfSides;


    public Stone(String color, String name, String location, String energyLebel, String numberOfSides) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLebel = energyLebel;
        this.numberOfSides = numberOfSides;
    }
}
