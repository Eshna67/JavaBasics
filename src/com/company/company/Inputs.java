package com.company;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
//        int numA;
//        int numB;
//        Scanner input = new Scanner(System.in);//It creates a new variable object called input which belongs to Scanner class
//        System.out.println("Enter the value of a");
//        numA= input.nextInt();//nextInt is in-built function of this particular Scanner object, this function helps to take a user input
//        System.out.println("Enter the value of b");
//        numB= input.nextInt();
//        System.out.println(numA+numB);
        int c;
        Scanner input=new Scanner(System.in);
        c=input.nextInt();
        float f=(float)9*c/5+32;
        System.out.println(f);

        int a=200;
        double d=420.4;

        a= (int) d;
        double b=(double) a;
        System.out.println(a);
        System.out.println(b);

// To find teh smallest number
        int n1, n2, n3;
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
//You can take byc omparing two numbers also, I have compared using three at a time below
//        if (n1<n2){
//            if (n1<n3){
//                System.out.println("The smallest number entered is "+n1);
//            }
//            else {
//                System.out.println("The smallest number entered is "+n3);
//            }
//        }
//        else {
//            if(n2<n3){
//                System.out.println("The smallest number entered is "+n2);
//            }
//            else {
//                System.out.println("The smallest number entered is "+n3);
//            }
//        }
        if (n1<n2 && n1<n3){
            System.out.println("The smallest number entered is "+n1);
        }
        if (n2<n1 && n2<n3){
            System.out.println("The smallest number entered is "+n2);
        }
        if (n3<n1 && n3<n2){
            System.out.println("The smallest number entered is "+n3);
        }

    }
}
