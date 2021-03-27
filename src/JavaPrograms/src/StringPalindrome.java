import java.io.*;
import java.util.*;

    public class StringPalindrome {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String n = sc.next();
            StringBuilder sb = new StringBuilder(n);
            sb.reverse();
            if (Objects.equals(sb.toString(), n))
            //Objects is a class in java.util.Objects-- This class consists of static utility methods for operating on objects.
            //eg, equals,compare,toString methods
            {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    /*
    Objects that have 9 static utility methods for operating on objects.
    These utilities include null-safe methods for computing the hash code of an object, returning a string for an object, and comparing two objects.

Using Objects class methods, one can smartly handle NullPointerException and can also show customized NullPointerException message(if an Exception occur).
     */





