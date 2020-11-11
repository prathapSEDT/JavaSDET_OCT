package com.rehansqapoint.oops.interfaces;

public class TestUser {
    public static void main(String[] args) {
        UserModuleImpl userModule=new User();
        //webdriver driver=new ChromeDriver(); new FireFOxDriver();
        //parent p =new child();

        userModule.addUser();
        userModule.login();

    }
}
