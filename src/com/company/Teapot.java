package com.company;

public class Teapot extends Dish {
    @Override
    public boolean isIntegrity() {
        return super.isIntegrity();
    }

    @Override
    public void setIntegrity(boolean integrity) {
        super.setIntegrity(integrity);
    }

    public Teapot(boolean integrity) {
        super(integrity);
    }

    public Teapot() {
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
