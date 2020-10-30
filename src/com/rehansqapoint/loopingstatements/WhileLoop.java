package com.rehansqapoint.loopingstatements;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException {
        boolean status=true;
        int  start=0;
        while(status){
            System.out.println("Hello.......");

            if(start==5){
                status=false;
            }
            else {
                start++;
            }
            Thread.sleep(1000);

        }
    }
}
