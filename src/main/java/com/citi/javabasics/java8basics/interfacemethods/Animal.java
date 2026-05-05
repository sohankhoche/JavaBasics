package com.citi.javabasics.java8basics.interfacemethods;

public interface Animal {

    public void specialCapabilities();

    default public void legs(){
        System.out.println("Animals have 4 legs generally!");
    }

}
