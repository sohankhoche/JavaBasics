package com.citi.javabasics.java8basics.interfacemethods;

public interface AquaticAnimal {

    /*default public void livesIn(){
        System.out.println("Lives in Water!");
    }*/
    default public void livesIn(){
        System.out.println("Lives in Water!");
    }

}
