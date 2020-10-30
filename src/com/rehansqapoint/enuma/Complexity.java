package com.rehansqapoint.enuma;

public enum Complexity {

    LOW("There is no risk here"),
    MEDIUM("There is a business risk available"),
    HIGH("Should address immedialtly");
    String value=null;


    Complexity(String value) {
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
