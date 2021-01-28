package com.company;

class Shape {
    public Shape() {
        super();
//The line ‘super()’ is a call to the default constructor of the Object class that acts as the default superclass for the Shape class.
// Remember, a class that does not have a superclass, acts as the subclass of the Object class by default.
        System.out.println("inside Shape class default constructor");
    }
}

class Rectangle extends Shape {
    public Rectangle() {
        super();
        System.out.println("inside Rectangle class default constructor");
    }
}

class Squares extends Rectangle {
    public Squares() {
        super();
        System.out.println("inside Square class default constructor");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        Squares sq = new Squares();
    }
}