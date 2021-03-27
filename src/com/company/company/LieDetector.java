package company;

import java.util.Scanner;

public class LieDetector {
    public static void main(String[] args) {
            int x, y;
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
            y = input.nextInt();
            int sum = x + y;
            if (sum > 30) {
                System.out.println("The statement said by the person is true");
            }
    else{
                System.out.println("The statement said by the person is false");
            }
        char a=56;

        int b=20;

        int c=a+b;

        System.out.println(c); //The code would execute error-free and would print 76 on the console. While making the calculation, a+b, the ASCII value of a would be considered and the calculation would be done.
        int speed1 = 15;

        double speed2 = speed1*(5/18);

        System.out.println(speed2);


    }
}

