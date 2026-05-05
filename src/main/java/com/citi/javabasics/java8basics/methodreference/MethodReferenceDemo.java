package com.citi.javabasics.java8basics.methodreference;

import com.citi.javabasics.java8basics.funcinterfaces.CustomFuncInterface;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        //Method Reference is a replacement for Lambda Expressions.
        //Used to refer method of a functional interface to existing method!
        CustomFuncInterface cstmFuncInterface = Test :: testImplementation;
        cstmFuncInterface.singleAbstractMethod();
        // If no Test Implementation is available in existing code base then use - Code For Lambda Expressions
        CustomFuncInterface cstmFI = () -> System.out.println("This is Test Implementation for SAM!");
        cstmFI.singleAbstractMethod();
        /*
            Whenever we have existing Implementation of abstract method of our Functional Interface, then we can go for method reference.
            If no such Implementation is available - then - go for lambda expressions.
        */
    }

}
class Test{
    public static void testImplementation() {
        System.out.println("This is Test Implementation for SAM!");
    }
}
