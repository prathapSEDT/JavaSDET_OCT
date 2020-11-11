package com.rehansqapoint.oops;

public class Polymorphisim {

    public void add(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    public void add(int a ,int b){
        System.out.println(a+b);
    }

    protected Object add(int a ,int b,int c){
        return (a+b+c);
    }

    public void test(){
        System.out.println("testttt");
    }


}
