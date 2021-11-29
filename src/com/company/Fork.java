package com.company;

public class Fork extends Dish {
    @Override
    public boolean isIntegrity() {
        return super.isIntegrity();
    }

    @Override
    public void setIntegrity(boolean integrity) {
        super.setIntegrity(integrity);
    }

    public Fork(boolean integrity) {
        super(integrity);
    }

    public Fork() {
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
