package com.company;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
/*  if (condition 1): //will execute only if outer condition is true
        {Action1}
if (condition 1A):
        {Action 1A}
else
        {Action 1B}
else
        {condition2}
 */
        int age, vote;
        Scanner input= new Scanner(System.in);
        age=input.nextInt();
        vote=input.nextInt();
        if (age<18)
        {
            System.out.println("You are not eligible");
        }
        else if (vote==1){
            System.out.println("You have voted for Ram");
        }
        else if (vote==2){
            System.out.println("You have voted for Shyam");
        }else if (vote==3){
            System.out.println("You have voted for Ghanshyam");
        }
        else {
            System.out.println("Please enter valid option");
        }
//        Let’s say that the 1st of January of a given non-leap year is a Monday. Write a program that takes the day number and returns what day it is.
        Scanner scan = new Scanner(System.in);
        // Enter month
        String month = scan.next();
        // Enter date
        int date = scan.nextInt();

        int day = 0;
        switch (month) {
            case "January":
                day = date;
                break;
            case "February":
                day = 31 + date;
                break;
            case "March":
                day = 31 + 28 + date;
                break;
            case "April":
                day = 31 + 28 + 31 + date;
                break;
            case "May":
                day = 31 + 28 + 31 + 30 + date;
                break;
            case "June":
                day = 31 + 28 + 31 + 30 + 31 + date;
                break;
            case "July":
                day = 31 + 28 + 31 + 30 + 31 + 30 + date;
                break;
            case "August":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
                break;
            case "September":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
                break;
            case "October":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
                break;
            case "November":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
                break;
            case "December":
                day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
                break;
            default:
                System.out.println("Invalid input");
        }
        int dayNumber = day % 7;
        // since day 1 is Monday
        if (dayNumber == 0 || dayNumber == 6) {
            System.out.print("Hurray!");
        } else {
            System.out.print("Ohhh! It's a work day :|");
        }
        scan.close();

    }
}
