package com.rehansqapoint.strings.methods;

public class StringFormating {
    public static void main(String[] args) {
        String str="select * from mt_emp_deatils where emp_id='param1'";
        str=str.replace("param1","hello");
        System.out.println(str);
    }
}
