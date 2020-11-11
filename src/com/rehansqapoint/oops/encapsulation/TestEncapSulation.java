package com.rehansqapoint.oops.encapsulation;

public class TestEncapSulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("Prathap");
        emp.setCompany("CTS");
        emp.setSalary(98000.00);

        System.out.println(emp.getCompany());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());


    }
}
