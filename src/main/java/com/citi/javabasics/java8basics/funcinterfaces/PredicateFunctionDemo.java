package com.citi.javabasics.java8basics.funcinterfaces;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

    public static void main(String[] args) {

        System.out.println("Predicate Function Demo!");
        PredicateFunctionDemo predicateFunctionDemo = new PredicateFunctionDemo();
        boolean funcResult = predicateFunctionDemo.stringLength("Predicate Function Demo");
        System.out.println("funcReslt " + funcResult);
        Predicate<String> checkLength = s -> s.length() >= 5;
        boolean predicateResult = checkLength.test("Predicate Demo Function");
        System.out.println("predct Res" + predicateResult);
        // Predicate joining is possible to check multiple conditions for boolean result - in that case it is useful
        // e.g. checklength > = 5 and length == even
        // 1] and 2] or 3] negate
    }

    public boolean stringLength(String str){
        System.out.println(
                "inside stringLength Function"
        );
        if(str.length()>5)
            return true;
        else
            return false;
    }

}
