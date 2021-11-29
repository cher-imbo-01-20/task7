package com.company;

public class Plate extends Dish{
    @Override
    public boolean isIntegrity() {
        return super.isIntegrity();
    }

    @Override
    public void setIntegrity(boolean integrity) {
        super.setIntegrity(integrity);
    }

    public Plate(boolean integrity) {
        super(integrity);
    }

    public Plate() {
        super();
    }

    @Override
    public String getIntegrity() {
        return super.getIntegrity();
    }

    @Override
    public void output() {
        super.output();
    }
}
