package com.rehansqapoint.oops.changesininterface;

public interface TestMethods {
    void add();
    void sub();
    void mul();

   static void myNewMethod(){
       System.out.println("I am from interace newly added method");
   }
   default void myDefaultMethod(){
       System.out.println("My Default Methods");
   }
}
