package test;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String s = input.nextLine();
        int n = s.length();
        int flag = 0;
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(n - i - 1) != s.charAt(i)) {
                flag = 1;
                System.out.println("no got it wrong");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("you got it right");
        }
    }


}