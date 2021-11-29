package com.company;

public abstract class Dish {
    boolean integrity;

    public boolean isIntegrity() {
        return integrity;
    }

    public void setIntegrity(boolean integrity) {
        this.integrity = integrity;
    }

    public Dish(boolean integrity) {
        this.integrity = integrity;
    }

    public Dish() {
    }

    public String getIntegrity() {
        if (this.integrity) return "It's whole";
        else return "Oh no! It's broken";
    }

    public void output() {
        System.out.println( "Dish{" +
                "integrity=" + integrity +
                " that means: " + this.getIntegrity() + " }");
    }
}
