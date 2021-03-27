package company;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
//        boolean keepDriving = false;
//        int currentFuel = 5;
//
//        while (currentFuel > 0){
//            keepDriving = true;
//            System.out.println("Keep on driving!");
//        }
//        keepDriving = false;
//        System.out.println("Need to refuel!");
        int num = 1;
        while (num <= 100) {
            System.out.println(num);
            num ++;
        }
//        boolean keepRunning = false; //infinite loop. The loop continuation condition — (keepRunning = true) — isn’t really checking if keepRunning is true; it is assigning a true value to keepRunning after every iteration. Thus, the loop is executed infinite times since it doesn’t know when to exit.
//        while (keepRunning = true) {
//            System.out.println("Hey");
//        }

        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        int counter=1;
        while (counter<=n){
            System.out.println(counter);
            counter=counter+1;
        }
        char a=97;
        while (a<=122){
            System.out.print(a+" ");
            a++;
        }
        int na=2;
        for (int i=12-na; i>2;i=i-na){
            System.out.println(i);
        }
/*
A while loop is used to execute a set of statements as long as a given condition is true, hence the first case would be implemented using a while loop.

A for loop is preferable when you have to execute a set of statements a fixed number of times, hence in the second case a for loop would be preferred.
 */
    }
}
