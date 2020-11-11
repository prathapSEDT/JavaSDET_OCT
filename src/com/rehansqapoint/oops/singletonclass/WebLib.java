package com.rehansqapoint.oops.singletonclass;

public class WebLib {
    private static WebLib webLib;
    private WebLib(){
        System.out.println("Creating an object");
    }

    public static WebLib getInstance(){
        if (webLib==null){webLib=new WebLib();};
        return webLib;
    }




    public void launchApp(){
        System.out.println("Launching application");
    }
    public void clickElement(){
        System.out.println("Clicking element");
    }
    public void sendData(){
        System.out.println("Sending infpr to the application");
    }
}
