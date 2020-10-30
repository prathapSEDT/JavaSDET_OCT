package com.rehansqapoint.staticvsinstnce;

public class TestStaticVsInstance {
    public static void main(String[] args) {
        Static_Class static_class=new Static_Class();
        static_class.addEmployee("Prathap","CTS",78900);
        static_class.addEmployee("Raj","TCS",7865);

        Static_Class obj=new Static_Class();
        obj.addEmployee("Roshan","Wipro",89000);


    }
}
