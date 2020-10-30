package com.rehansqapoint.thiskeyword;

public class TestThis {
    //global
    static String name="prathap";
    int a=10;
    int b=20;

// params---->> local variables
    public void add(int a,int b){
        System.out.println(a+b);
        System.out.println("-------------------");
        System.out.println(this.a+this.b);
        System.out.println(this.name);
    }

    public static void main(String[] args) {

        TestThis testThis=new TestThis();
        testThis.add(30,30);
    }

}
