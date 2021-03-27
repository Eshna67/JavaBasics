package company;

import java.util.Scanner;

public class booleanOperators {
    public static void main(String[] args) {
        int myAge = 16; //first

        int driveAge = 18;

        boolean canIDrive = !( myAge < driveAge);

        System.out.println(canIDrive);

        boolean A=true; //second
        boolean B=true;
        boolean C=true;
        boolean D=true;
        boolean c1=A&&B&&C&&D;
        boolean c2=A&&B||D&&C;
        System.out.println(c1);
        System.out.println(c2);

        //relational ops //third
        int a,b;
        Scanner input=new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        // a = 4; b = 5
        System.out.println(a>=b);
        System.out.println(a==b);

        //logical ops
        boolean x=true, y=false, z=true;

        // precedence order
        boolean result= x || y && !z;
        System.out.println(result);
    }
}
