package com.company;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            System.out.print(number+ " ");
            number++;
        }
//  Print first n integers starting from 0 in the reverse order using the for loop.
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        for (int i=n;i>=0;i--){
            System.out.println(i);
        }
//        Average - The first line will contain n which is the number of integers to be taken average of.
        int no=input.nextInt();
        int sum=0,numbers;
        for (int i=0;i<no;i++){
            numbers=input.nextInt();
            sum=sum+numbers;
        }
        int average=sum/no;
        System.out.print(average);
    }
}
