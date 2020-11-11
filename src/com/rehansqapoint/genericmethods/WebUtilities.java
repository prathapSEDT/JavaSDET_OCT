package com.rehansqapoint.genericmethods;

import com.rehansqapoint.jsondatautil.ReadJsonData;

public class WebUtilities extends ReadJsonData {
    public void launchBrowser(String browser){
        switch (browser){
            case "chrome":
                System.out.println("Launching chrome browser");
                break;
            case "ff":
                System.out.println("Launching fire fox browser");
                break;
        }
    }

    public void enterData(String elementName,String pageName,String data){
        System.out.println("Enter data into the field "+elementName+" on the page "+pageName+" with the data "+data);
    }
    public void clickElement(String elementName,String pageName){
        System.out.println("Click the element "+elementName+" on the page "+pageName);
    }
    public void verifyElementExist(String elementName,String pageName){
        System.out.println("The element "+elementName+" is exist on the page "+pageName);
    }
    public void logOut()
    {
        System.out.println("Logging out from the application");
    }

}
