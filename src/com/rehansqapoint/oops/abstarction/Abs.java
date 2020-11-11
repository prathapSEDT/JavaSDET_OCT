package com.rehansqapoint.oops.abstarction;

public abstract  class Abs implements AbsImpl{
    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

    public void testMyOwnMethod(){
        System.out.println("My Own Method in abstraction");
    }

    abstract void testAbsMethod();


}
