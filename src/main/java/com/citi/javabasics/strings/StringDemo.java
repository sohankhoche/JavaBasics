package com.citi.javabasics.strings;

import java.util.StringJoiner;

public class StringDemo {

    public static void main(String[] args) {
        System.out.println("Strings Demo!");
        creatingStringObjects();
    }

    // creating string objects using different ways
    public static void creatingStringObjects(){
        StringBuffer sbff = new StringBuffer("BufferString");
        StringBuilder sbld = new StringBuilder("BuilderString");
        StringJoiner sjnr = new StringJoiner(" ", "Joiner", "String 1");
        System.out.println("sjnr --> " + sjnr);
        sbff.append("BufferStringAppended");
        System.out.println("sbff Reversed! --> " + sbff.reverse());
        sbld.append("BuilderStringAppended");
        System.out.println("sbld Reversed! --> " + sbld.reverse());

        sbff.replace(2,5, " empty in between ");
        System.out.println("sbff - --> " + sbff);

        sbld.replace(2,5, " empty in between ");
        System.out.println("sbld - --> " + sbld);
        System.out.println("sbff --> " + sbff);
        System.out.println("sbld --> " + sbld);

    }

}
