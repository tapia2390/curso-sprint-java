package com.debugueandoideas;

public class SouldStone extends Stone {



    private static final String COLOR = "Orange";
    private static final String NAME = "Soul Stone";
    private static final String LOCATION = "Vormir";
    private static final int ENERGY_LEVEL = 3;


    public SouldStone() {
        super(COLOR, NAME, LOCATION, ENERGY_LEVEL);
    }


    @Override
    public void usePower() {
        System.out.println("");
    }

}
