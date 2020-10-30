package com.rehansqapoint.constructor;

public class Parent {
    int i;
    String c;
     Parent(){

        System.out.println(i);

        System.out.println("Zero arg based constructor");


    }


    Parent(int a,int b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        Parent p=new Parent();

    }
}
