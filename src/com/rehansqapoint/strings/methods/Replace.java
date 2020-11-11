package com.rehansqapoint.strings.methods;

public class Replace {
    public static void main(String[] args) {
        String str1="Thermameter %0$s High Land";
//        String output=str1.replace("The","Hey");
//        System.out.println(output);
        //%[argument_index$][flag]

        System.out.println(String.format(str1,"Heloo"));

    }
}
