package company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        //Without using any Loop
//        int hundreds, tens, ones, number;
//        number = 1;
//        hundreds = (number / 100) % 10;
//
//        System.out.printf("\nHundreds place digit: " + hundreds);
//
//        tens = (number / 10) % 10;
//
//        System.out.printf("\nTens place digit: " + tens);
//
//        ones = (number % 10);
//        System.out.println("\nOnes place digit: " + ones);
//
//        if (hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones == number) {
//            System.out.println("Without using any Loop : Armstrong number");
//        } else {
//            System.out.println("nopes");
//        }

        //Using Loop
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int p=n; //Initial value of n is stored in p bcz the value of n we are changing in for loop
        int sum=0;
        while (n>0)
        {
            int a=n%10;
            n=n/10;
            sum=sum+(a*a*a);
        }
        if (sum==p)
        {
            System.out.println("great, it is an Armstrong number");
        }
        else {
            System.out.println("No");
        }


    }
}
