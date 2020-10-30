package com.rehansqapoint.strings.task;

public class Task2 {
    public static void main(String[] args) {
        String str="WelcomeWelcomeWelcomeWelcomeWelcomeWelcome";
        // count how many time the word Welcome got repeated
        // hint use indexOf and Substring

        int count=0;
        String temp="";
        char[] arr=str.toLowerCase().toCharArray();
        for(char c :arr){
            temp=temp+c;

            if(temp.equals("welcome")){
                count++;
                temp="";
            }
        }
        System.out.println(count);
    }


}
