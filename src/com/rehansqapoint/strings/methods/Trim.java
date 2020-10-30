package com.rehansqapoint.strings.methods;

public class Trim {
    public static void main(String[] args) {
        String str="       india       Is great   ";
        System.out.println("Before :The length of the given source string : "+ str.length());

        str=str.trim();
        System.out.println("After :The length of the given source string : "+ str.length());
    }
}
