package com.rehansqapoint.strings;

public class StringImpl {
    public static void main(String[] args) {
        String str1="abc";// pool
        String str2="abc1";// pool
        if(str1==str2){
            //when we use ==, the hash code number will be compared
            // == is used to compare two numbers
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
