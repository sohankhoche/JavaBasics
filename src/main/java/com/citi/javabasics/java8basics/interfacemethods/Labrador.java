package com.citi.javabasics.java8basics.interfacemethods;

public class Labrador implements Animal{

    public String color = "Child Color";
    @Override
    public void specialCapabilities() {
        System.out.println("I am an Athletic Dog!");
    }
}
