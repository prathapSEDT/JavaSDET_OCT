package com.rehansqapoint.arrays;

public class StringArray {
    public static void main(String[] args) {

        Object [] data=new Object[4];
        data[0]="Raja";
        data[1]=78;
        data[2]=34.5;
        data[3]=false;
        for (Object obj:data) {
            System.out.println(obj);
        }

        System.out.println("----------");
        data[0]="Rakesh";
        for (Object obj:data) {
            System.out.println(obj);
        }

    }
}
