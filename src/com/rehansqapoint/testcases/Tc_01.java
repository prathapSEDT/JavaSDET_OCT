package com.rehansqapoint.testcases;

import com.rehansqapoint.genericmethods.WebUtilities;
import com.rehansqapoint.genericmethods.WebUtilities;
import com.rehansqapoint.jsondatautil.ReadJsonData;

public class Tc_01 extends WebUtilities {
    public static void main(String[] args) {
Tc_01 tc_01=new Tc_01();
tc_01.validateTestCase();
    }

    public void validateTestCase(){
        launchBrowser("ff");
        clickElement("Register Link","Home");
        verifyElementExist("Registartion Header","Register");
        enterData("First Name","Register","firstname");
        enterData("Last Name","Register","lastname");
        enterData("Day","Register","01");
        enterData("Month","Register","January");
        enterData("Year","Register","2020");
        clickElement("Submit","Register");
        verifyElementExist("Sucessfull","Register");


    }



}
