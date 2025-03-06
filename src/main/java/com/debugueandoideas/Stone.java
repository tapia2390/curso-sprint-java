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
    Integer energyLebel;
    Integer numberOfSides;

    private  static final int  NUMBER_SIDES = 6;


    public Stone(String color, String name, String location, Integer energyLebel) {
        this.color = color;
        this.name = name;
        this.location = location;
        this.energyLebel = energyLebel;
        this.numberOfSides = NUMBER_SIDES;
    }


    public abstract void usePower();
}
