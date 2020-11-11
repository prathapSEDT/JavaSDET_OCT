package com.rehansqapoint.oops.singletonclass;

public class Tc01 {
    public static void main(String[] args) {
        WebLib webLib=WebLib.getInstance();
        webLib.launchApp();

        WebLib obj=WebLib.getInstance();
        obj.clickElement();

    }
}
