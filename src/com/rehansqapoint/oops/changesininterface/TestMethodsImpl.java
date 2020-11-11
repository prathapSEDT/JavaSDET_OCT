package com.rehansqapoint.oops.changesininterface;

public class TestMethodsImpl implements TestMethods{
    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

    @Override
    public void mul() {

    }

    public static void main(String[] args) {
        TestMethods.myNewMethod();
        TestMethods methods=new TestMethodsImpl();
        methods.myDefaultMethod();
    }
}
