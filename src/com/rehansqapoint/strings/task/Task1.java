package com.rehansqapoint.strings.task;

public class Task1 {
    public static void main(String[] args) {
        String str="SCHOOL";
        /*
        S
        SC
        SCH
        SCHO
        SCHOO
        SCHOOL
         */
        String temp="";
        for(int i=0;i<=str.length()-1;i++)
        {

            for(int j=0;j<=i;j++)
            {
                temp=temp+String.valueOf(str.charAt(j));

            }
            System.out.println(temp);
            temp="";

        }




    }
}
