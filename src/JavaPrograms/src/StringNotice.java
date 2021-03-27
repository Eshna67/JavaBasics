import java.util.Scanner;

public class StringNotice {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
                     // Read the entire line of String
            System.out.println("enter name");
            String s = scan.nextLine();

            int i = scan.nextInt();       // Read the Integer data type

            double d = scan.nextDouble();      // Read the Double data type


            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }

