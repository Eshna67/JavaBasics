package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("First example");
        int myAge;
        int ageOfBrother;
        Scanner input = new Scanner(System.in);
        myAge = input.nextInt();
        ageOfBrother = input.nextInt();
        boolean discount = (myAge < 25 && ageOfBrother < 25 && myAge > 0 && ageOfBrother > 0);
        System.out.println(discount);

        System.out.println("Second example");
        int a = 23456 % 2;
        System.out.println(a);
        boolean bool1, bool2;
        bool1 = (1 > 2 || 2 < 4); //true
        bool2 = (23456 % 2 > 0); //false
        if (bool1 && bool2) { //true && false = false
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        System.out.println("Third example");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (x < y) {
            System.out.println(y + " is greater than " + x);
        } else if (x == y) {
            System.out.println(x + " is equal to " + y);
        } else {
            System.out.println("Please enter valid numbers...");
        }
        System.out.println("Fourth example: Inc/Dec Order");
        System.out.println("Enter n1");
        int n1 = in.nextInt();
        System.out.println("Enter n2");
        int n2 = in.nextInt();
        System.out.println("Enter n3");
        int n3 = in.nextInt();
        if (n1 > n2 && n2 > n3) {
            System.out.println("The numbers entered are in decreasing order");
        } else if (n1 < n2 && n2 < n3) {
            System.out.println("The numbers entered are in increasing order");
        } else {
            System.out.println("The number are in neither in increasing order nor in decreasing order");

        }

        String name;
        int marks;
        System.out.println("Enter name");
        in.nextLine();
        name = in.nextLine();
        System.out.println("Enter marks");
        marks = in.nextInt();
        if (marks >= 100) {
            System.out.println("The grade scored by " + name + " " + "is A");
        } else if (marks > 80 && marks < 100) {
            System.out.println("The grade scored by " + name + " " + "is B");
        } else if (marks > 60 && marks <= 80) {
            System.out.println("The grade scored by " + name + " " + "is C");
        } else if (marks > 40 && marks < 60 || marks == 60) {
            System.out.println("The grade scored by " + name + " " + "is D");
        } else if (marks <= 40) {
            System.out.println("The grade scored by " + name + " " + "is E");
        }

    }
}

