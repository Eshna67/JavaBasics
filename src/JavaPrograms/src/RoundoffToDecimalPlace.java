import java.util.*;
class RoundoffToDecimalPlace {
    public static void main (String[] args) {
        String name;
        int no;
        double price;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the car name:");
        name=inp.nextLine();
        System.out.println("Enter the car no:");
        no=inp.nextInt();
        System.out.println("Enter the price:");
        price=inp.nextDouble();

        System.out.println("Carname:"+name);
        System.out.println("Carno:"+no);
        System.out.println("Price:"+String.format("%.2f",price)+" "+"rs only");
        //Rounding off to two decimal places, using String.format
    }
}