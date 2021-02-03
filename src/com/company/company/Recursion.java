package com.company;

public class Recursion {
    public static void main(String[] args) {

        int myNumber = 16524;

        recursivePrintDigits(myNumber);
//        fun(10); // it will print reverse order as per call stack
    }
    public static  void fun(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }
    public static void recursivePrintDigits(int number) {
        int response = 0, n = 0;

        n = number / 10;
        response = number % 10;

        if (n > 0) {
            recursivePrintDigits(n);
        }
        System.out.println(response);
    }

    }
