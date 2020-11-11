package com.rehansqapoint.oops;

public class TestPolymorphisim extends Polymorphisim{

    public static void main(String[] args) {


    }

    @Override
    public Integer add(int a, int b, int c){
        System.out.println("i am from child class");
        System.out.println(10+89);
        return a+b+c;
    }

    public void doTest(){
        System.out.println("do testing.....");
    }
}
