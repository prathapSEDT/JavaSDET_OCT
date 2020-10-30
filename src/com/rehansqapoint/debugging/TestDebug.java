package com.rehansqapoint.debugging;

public class TestDebug {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        add(a,b);
        a=a+b;
        b=a+b;

        add(a,b);
    }

    public static void add(int a, int b)
    {
        System.out.println(a+b);
    }
}

