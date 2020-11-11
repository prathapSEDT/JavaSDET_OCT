package com.rehansqapoint.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String str="firstname123.lastname123@gmail.com";
        String pattern="[a-z0-9]*\\.[a-z0-9]*\\@gmail\\.com";
        Pattern ptrn=Pattern.compile(pattern);
        Matcher matcher=ptrn.matcher(str);
        //System.out.println(matcher.find());

        while (matcher.find()){
            System.out.println(matcher.group(0));

        }


    }
}
