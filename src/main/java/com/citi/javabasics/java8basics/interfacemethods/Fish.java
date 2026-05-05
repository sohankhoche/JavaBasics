package com.citi.javabasics.java8basics.interfacemethods;

public class Fish implements  Animal{

    public void canSwim(){

        System.out.println("Fish can swim!");

    }
    @Override
    public void specialCapabilities() {
        System.out.println("Fish can swim!");
    }

    public void legs(){
        System.out.println("Fish does not have legs!");
    }

}
