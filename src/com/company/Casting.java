package com.company;
//import java.util.Scanner;
public class Casting {
    public static void main(String[] args) {
//        char a='a';
//        char b='A';
//        int i=(int)a-(int)b; //97-65=32
//        char c=(char) i;
//        System.out.print(c);
//        int a=2;
//        char b='1';
//        int c=a+(int)b;
//        System.out.println(c);
//        Scanner input= new Scanner(System.in);
//        int a=input.nextInt();
//        float f=input.nextFloat();
//        double d=input.nextDouble();
//        float x= (float)a;//Casting is conversion of datatype temporarily
//        int y=(int)f;
//        float z=(float)d;
//        System.out.println("x="+x+" y="+y+" z="+z); }
        //"x="+x+" y"-- space
        char c = 'a';
        while (c <= 'z') {
            System.out.print(c + " "); // to print series a-z
            c++;
            //“Casting”. This is a process that will let you know how you can convert one data type to another.
//        double x = 2.5;
//        double y = 1.5;
//        double z = (int)x/(int)y;
//        System.out.println(z); }

            int A=6;
            double B=5.5;
            double sum=A+B; //or,  int sum = a + (int)b;
            System.out.println((int)sum); //System.out.println(sum);
        }
    }
}
