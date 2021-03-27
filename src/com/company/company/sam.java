package company;

import java.util.Scanner;

public class sam
{
    public static void main(String[] args) {
//        char a=56;
//        System.out.println(a); //Since all characters correspond to some ASCII code, when you try to store the integer 56 in a char variable, it will be interpreted as an ASCII code and not as an integer.
//Since the character associated with the ASCII value 56 is ‘8’, hence ‘8’ will be printed on the console when you try to print the char variable a.

//    String firstName="John";
//    String secondName="Lenon";
//    System.out.println("My name is: "+firstName +" " +secondName); // the program reads firstName as variable name and finds it in program to find teh value of teh variable
        String name;
        int years;
        Scanner input= new Scanner(System.in);
        name=input.nextLine();
        years=input.nextInt();
        years=years+4;
        System.out.println("Hello"+ " "+name+"\n"+"Free services till:"+years);


    }


}
