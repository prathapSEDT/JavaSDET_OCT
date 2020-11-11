package com.rehansqapoint.strings.task;

public class Task2_2 {
    public static void main(String[] args) {
        String str="WelcomeWelcomeWelcomeWelcomeWelcomeWelcome";
        // count how many time the word Welcome got repeated
        // hint use indexOf and Substring
        int i=0;
        int count=0;
        str=str.toLowerCase();
        do{
            String out=str.substring(0,7);
            if(out.equals("welcome")){
                count++;
                i=i+7;
                str=str.substring(i);
                i=0;
            }
        }while (str.length()!=0);
        System.out.println(count);







    }


}
