package com.rehansqapoint.returnvalue_const;

public class ReturnVal {
     int a;
    ReturnVal(int a){
       this.a=a;
    }

    public  int getValue(){
        return a;
    }

    public static void main(String[] args) {
        ReturnVal returnVal=new ReturnVal(23);
        int result=returnVal.getValue();
        System.out.println(result);
    }

}
