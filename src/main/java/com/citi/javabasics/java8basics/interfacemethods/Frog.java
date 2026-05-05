package com.citi.javabasics.java8basics.interfacemethods;

public class Frog implements Animal, AquaticAnimal, TerrestrialAnimal{


    @Override
    public void specialCapabilities() {
        System.out.println("Frog is an Amphibian Animal!");
        System.out.println("Frog lives in both, Land and Water.");
    }

    // If method is static --> then can be called with the help of Interface name
    // If method is default --> then need to be overriden and called with the help of super keyword
    @Override
    public void livesIn() {
        //AquaticAnimal.super.livesIn();
        // Make livesIn() Method static and the call would be resolved as below  --> InterfaceName.StaticMethodName
        AquaticAnimal.super.livesIn();  // default method overriden and called
        TerrestrialAnimal.livesIn();   // static method called with the help of Interface Name and Method Name
    }
}

