package com.company;

public class ClassVsObject {
/*
   What are objects?

Class is a blueprint and objects are the blocks built upon this blueprint with certain state and behaviour.

   What is state and behaviour of an object?

The state of an object refers to the specific values of the variables of the class the object belongs to. The behaviour of an object refers to the action performed by the object when called by a particular method from the class.

    */

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10.0f;
        System.out.println("area of circle = " + c1.area());
    }
}

class Circle {
    public float radius;

    public float area() {
        return 3.141f * radius * radius;
    }

}
