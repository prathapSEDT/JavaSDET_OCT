package com.rehansqapoint.strings.methods;

public class Split {
    public static void main(String[] args) {
        String str="india-china-japan";
        String[] arr=str.split("-");
        for (String word:arr ) {
            System.out.println(word);
        }
    }
}
