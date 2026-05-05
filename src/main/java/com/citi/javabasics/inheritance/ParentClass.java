package com.citi.javabasics.inheritance;

public class ParentClass {

    public int parentId;

    public String parent;

    public ParentClass(){

    }

    public void parentMethod(){
        System.out.println("I am parent method!");
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public ParentClass(int parentId, String parent) {
        this.parentId = parentId;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "parentId=" + parentId +
                ", parent='" + parent + '\'' +
                '}';
    }
}
