package com.citi.javabasics.java8basics.funcinterfaces;

@FunctionalInterface
public interface CustomFuncInterface {

    // It must have at least one abstract method
    void singleAbstractMethod();

    default String firstDefaultMethod(){
        return "I am first Default Method!";
    }

}
