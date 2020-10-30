package com.rehansqapoint.staticvsinstnce;

public class Static_Class {
     static int id=1;

public  void addEmployee(String name,String comp, double salary){

    System.out.println("Adding an employee with the details like");
    System.out.println("Name : "+name);
    System.out.println("Company : "+comp);
    System.out.println("Salary : "+salary);
    System.out.println("ID : "+id);
    id=id+1;

}
}
