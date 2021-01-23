package com.company;

import com.sun.javafx.scene.paint.GradientUtils;

public class PrivateAccessModifier {

//On declaring any variable as private, you cannot read or assign any new value to that variable from outside the class in which that attribute is declared.
// It basically restricts the access of that variable from outside the class.

        public static void main(String[] a) {
            duplicateCircle c1 = new duplicateCircle(10f);
           // radius=10.11f; If someone is trying to tweak the code in b/w
            printCircles(c1);
        }

    public static void printCircles(duplicateCircle c){
        System.out.println("area of circle = " + c.area());
//Disadv of private -- You can't even read the value from outside the class. Neither read nor update
       System.out.println("area of circle = " + c.getRadius() +c.area()); //GETTER Method helps in reading the value of private modifiers

       //If you uncomment the above code with c.radius, it will throw error as -- 'radius' has private access in 'com.company.duplicateCircle
        }
}

class duplicateCircle{
    private float radius;
    public static final float PI = 3.1414f;

    public duplicateCircle(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }

    public float getRadius() { //GETTER METHOD Please make sure the datatype is same as what you are returning.
        return radius;
    }
}





