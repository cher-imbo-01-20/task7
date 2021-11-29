package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------test Dish-----------"+"\n");
        Fork fork1 = new Fork (true);
        Plate plate1 = new Plate();
        Teapot teapot1 = new Teapot();
        teapot1.setIntegrity(true);
        fork1.setIntegrity(false);
        fork1.output();
        System.out.println("\n");
        plate1.output();
        System.out.println("\n");
        teapot1.output();
        System.out.println("\n");
        System.out.println("----------test Dog-----------"+"\n");
        York Billy = new York();
        Husky Jean = new Husky("long","normal");
        System.out.println(Billy.toString()+"\n"+Jean.toString());

    }
}
