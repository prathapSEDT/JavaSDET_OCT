package com.rehansqapoint.oops.annoymousclass;

public class TestAnnoymousClass {
    public static void main(String[] args) {
        Annoymous annoymous=new Annoymous() {
            @Override
            public void myOwnMethod() {
                System.out.println("Hey i am class with no name");
            }
        };

        annoymous.myOwnMethod();
    }
}
