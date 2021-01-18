package com.company;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
//        program to count the number of digits in a number entered by the user
//        int n;
       Scanner input= new Scanner(System.in);
//        n=input.nextInt();
//        int counter=0;
//        do{
//            n=n/10;
//            counter=counter+1;
//        }while (n>0);
//        System.out.print(counter);
//    }
//    HCF of two numbers
//        Algorithm
//        Define two variables - A, B
//
//        Set loop from 1 to max of A, B
//
//        Check if both are completely divided by same loop number, if yes, store it
//
//        Display the stored number is HCF
int num1 = input.nextInt();
    // Enter number 2 in the Input Console
    int num2 = input.nextInt();

    int hcf;
    hcf=num2/num1;
    // Write logic

    System.out.print(hcf);
    input.close();
}
}