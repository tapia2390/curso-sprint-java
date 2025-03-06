package com.debugueandoideas;

import lombok.ToString;

@ToString
public class MindStone extends Stone {



    private static final String COLOR = "Yellow";
    private static final String NAME = "Mind Stone";
    private static final String LOCATION = "Scepter";
    private static final int ENERGY_LEVEL = 4;


    public MindStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }


    @Override
    public void usePower() {
        System.out.println("Mind Control in stone : " + this.toString() );
    }

}
