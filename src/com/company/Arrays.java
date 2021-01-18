package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Arrays are list of objects which are made of the same datatype
// String students[];
// students=new String[4];//new keyword used in java, tell the program that you are about create/ allocate  space to the left variable
// students[0]="adam";
// students[1]="lucy";
//        System.out.println((students[3]));
//  //String marks[]={"50","82","9","90"}; //another way of declaring without using explicit keywords, new
//     //   System.out.println((marks[1]));
//int naturalNumbers[]={0,1,2,3,4,5,6,7,8,9};
//        System.out.println(80/10*4);
//        int a=8;int b=6;
//        System.out.println("My friend's age is "+(a+b)); //paranthesis BODMAS then 14, else String +Int =String 86
//This is because the integers first gets converted to string in first case while they first get added up in second one.
        int[] marks;
        marks = new int[5];
        Scanner input = new Scanner(System.in);
//        marks[0] = input.nextInt();
//        marks[1] = input.nextInt();
//        marks[2] = input.nextInt();
//        marks[3] = input.nextInt();
//        marks[4] = input.nextInt(); // Replacing with loops
        for (int i = 0; i < 5; i++) {
            marks[i] = input.nextInt();
        }
        int rollNumber;
        rollNumber = input.nextInt();
        System.out.println("The student with roll number " + rollNumber + " has scored " + marks[rollNumber] + " marks");
        //System.out.println("The student with"+rollNumber[]+"has scored"+marks[]);
//        int i=1;
//        do{
//            System.out.println("Dekha Mera Kamal");
//        }
//        while(i<5);

//        while(i<5)
//        {
//            System.out.println("Dekha Mera Kamal");
//            i++;
//        }

//        for(int i=0;i<5;i++)
//        {
//            System.out.println("Dekha Mera Kamal");
//        }
        int intArray[] = {1, 2, 3};

        int cloneArray[] = intArray.clone();

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }
}
