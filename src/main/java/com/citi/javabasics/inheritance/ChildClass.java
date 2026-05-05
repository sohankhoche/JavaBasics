package com.citi.javabasics.inheritance;

public class ChildClass extends ParentClass {

    private int childId;

    private String childString;

    public String parent;

    @Override
    public void parentMethod(){
        System.out.println("Parent Method in ChildClass" + "parent :" + parent + parentId);
    }

    public ChildClass() {}

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getChildString() {
        return childString;
    }

    public void setChildString(String childString) {
        this.childString = childString;
    }

    @Override
    public String getParent() {
        return parent;
    }

    @Override
    public void setParent(String parent) {
        this.parent = parent;
    }

    public ChildClass(int parentId, int childId, String childString, String parent) {
        super(parentId, parent);
        this.childId = childId;
        this.childString = childString;
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "ChildClass{" +
                "childId=" + childId +
                ", childString='" + childString + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }
}
