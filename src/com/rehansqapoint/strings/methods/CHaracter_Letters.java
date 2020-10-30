package com.rehansqapoint.strings.methods;

public class CHaracter_Letters {
    public static void main(String[] args) {
        String str1="India Japan America";

        char[] arr=str1.toCharArray();
        for(char c : arr){
            if(Character.isLetter(c)){
                System.out.println(c);
            }
        }

    }
}
