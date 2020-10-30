package com.rehansqapoint.conditionalstatements;

public class Elif {
    public static void main(String[] args) {
        int a=70;
        int b=80;

        if(a>b){
            System.out.println("A is greater than B");
        }else if(a>=40 && a<=70){
            System.out.println("A is less than B, but it is in the range of 40 - 70");
        }else {
            System.out.println("A is less than B, also not in the range of 40-70");
        }
    }
}
