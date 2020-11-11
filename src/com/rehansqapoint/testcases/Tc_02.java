package com.rehansqapoint.testcases;

import com.rehansqapoint.genericmethods.WebUtilities;

public class Tc_02 extends WebUtilities {
    public static void main(String[] args) {

    }
    public void validateTestCase(){
        launchBrowser("ff");
        clickElement("Login Link","Home");
        verifyElementExist("Logib Header","Login");
        enterData("User Name","Login","user01");
        enterData("Password","Login","password");
        clickElement("Login","Login");
        verifyElementExist("Sucessfull","Register");


    }
}
