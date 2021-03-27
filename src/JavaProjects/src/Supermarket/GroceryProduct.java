package Supermarket;

import java.awt.*;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryProduct {
    private String name;
    private double price;
    private double discount;

    public GroceryProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public double getActualPrice() {
        return price - (price * discount / 100);
    }

    //Implementing Getter and Setter in order to update and retrieve each instance variable on its own
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String display() {
        return (
                "Name of Product you chose: " + name + "\n" +
                        "Price: " + price + "\n" +
                        "You got Discount: " + discount + "%"
        );
    }

    public static void main(String[] args) {
        ArrayList <GroceryProduct> cart = new ArrayList <GroceryProduct>();
        GroceryProduct toast = new GroceryProduct("Toast",2.5,10);
        cart.add(toast);
        System.out.println("GroceryProduct you choose: ");
        System.out.println("Displaying details of toast"+"\n"+toast.display());
        System.out.println("Actual Price of toast after discount"+toast.getActualPrice()+"\n");

        GroceryProduct bread = new GroceryProduct("Bread",2.5,10);
        cart.add(bread);
        System.out.println("GroceryProduct you choose: ");
        System.out.println("Displaying details of bread"+"\n"+bread.display());
        System.out.println("Actual Price of bread after discount"+bread.getActualPrice()+"\n");

        BeverageProduct coke = new BeverageProduct("Coke",30,5,SugarLevel.ADDED_SUGAR);
        cart.add(coke);
        System.out.println("Beverage you choose : ");
        System.out.println("Displaying details of coke"+"\n"+coke.display());
        System.out.println("Actual Price of coke after discount"+coke.getActualPrice()+"\n");

        DairyProduct milk=new DairyProduct("Milk", 100, 5, Fat.FULLCREAM);
        cart.add(milk);
        System.out.println("DairyProduct you choose : ");
        System.out.println("Displaying details of milk"+"\n"+milk.display());
        System.out.println("Actual Price of milk after discount"+milk.getActualPrice()+"\n");

        double total=0;

        for (int i=0;i<cart.size();i++) {
            total+=cart.get(i).getActualPrice();
    }
        System.out.println("\n The total cost of all products is "+total);
}
}
