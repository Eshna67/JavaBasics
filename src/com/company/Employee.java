package com.company;


class Employees {

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    public Employees(int empid, String empFirstName, String empSecondName, double empSalary) {
        this.empId=empid;
        this.empFirstName=empFirstName;
        this.empSecondName=empSecondName;
        this.empSalary=empSalary;
    }

    //Write your code here


    public int getEmpId() {
        return empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpSecondName() {
        return empSecondName;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}

public class Employee {
    public static void main(String[] args) {

        //Write your code here
        Employees e1=new Employees(101512031, "Sushil", "Kumar", 45000.58);
        Employees e2=new Employees(101512032, "Tara", "Sharma",51000.99);

        System.out.println("employee full name "+e1.getEmpFirstName()+" "+e1.getEmpSecondName());
        System.out.println("employee annual package "+e1.getEmpSalary());
        System.out.println("employee full name "+e2.getEmpFirstName()+" "+e2.getEmpSecondName());
        System.out.println("employee annual package "+e2.getEmpSalary());
    }
}
