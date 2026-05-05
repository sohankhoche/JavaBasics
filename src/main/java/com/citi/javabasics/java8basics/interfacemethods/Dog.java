package com.citi.javabasics.java8basics.interfacemethods;

public class Dog implements Animal{

    public String color = "Parent Color";
    private String name;
    private String breed;
    private int age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void specialCapabilities() {
        System.out.println("Dogs can bark!");
    }

    @Override
    public void legs() {
        Animal.super.legs();
    }
}
