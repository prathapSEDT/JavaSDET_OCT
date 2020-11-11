package com.rehansqapoint.strings.task;

public class Task3 {
    public static void main(String[] args) {
        String str="AB45DE7778865645465GH89";
        // print the sum of all the numbers
        //45+765+89

        String temp="";
        for(int i=0;i<=str.length()-1;i++){
            char curr=str.charAt(i);
            temp=temp+curr;
            if(i!=str.length()-1){
            char nextchar=str.charAt(i+1);
            if(Character.isLetter(curr) && Character.isDigit(nextchar)|| Character.isLetter(nextchar) && Character.isDigit(curr)){
                temp=temp+"@";
            }}
      }
        str=temp.replaceAll("[^0-9\\@]","");
        int sum=0;
       String[] arr=str.split("@");
        for (String num:arr) {
            if(! num.isEmpty())
            {
                sum=sum+Integer.valueOf(num);
            }

        }
        System.out.println(sum);



    }
}
