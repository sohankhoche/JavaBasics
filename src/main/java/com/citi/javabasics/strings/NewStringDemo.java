package com.citi.javabasics.strings;

public class NewStringDemo {

    public static void main(String[] args) {
        System.out.println("New StringDemo!");
        String s1 = "Sohan";
        String s2 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode() + " && " + s2.hashCode());
        System.out.println(s1.equals(s2));
        String s3 = "Sohan";
        s3 = s3.intern();
        System.out.println("s1 == s2 --> hashCode() " + s1.hashCode() + " && " + s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println("s1 == s3 --> hashCode() " + s1.hashCode() + " && " + s3.hashCode());
        System.out.println(s1 == s3);
        System.out.println("s1.equals(s3) --> " + s1.equals(s3));
        System.out.println("s2 == s3 --> hashCode() " + s2.hashCode() + " && " + s3.hashCode());
        System.out.println(s2 == s3);
        System.out.println("s2.equals(s3) --> " + s2.equals(s3));



    }

}
