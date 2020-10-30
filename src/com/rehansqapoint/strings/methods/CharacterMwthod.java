package com.rehansqapoint.strings.methods;

public class CharacterMwthod {
    public static void main(String[] args) {
        String temp="";
        String str="india123";
        char[] arr=str.toCharArray();
        for (Character c:arr) {
            if(Character.isDigit(c)){
                temp=temp+c;
            }
        }
        System.out.println(temp);
    }
}
