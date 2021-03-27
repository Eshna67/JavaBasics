import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int i =Integer.parseInt(n);
        /* Enter your code here. Print output to STDOUT. */
        int temp,rev=0;
        while(i!=0)
        {
            temp=i%10;
            rev=rev*10+temp;
            i=i/10;
        }

        if (i==rev)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



