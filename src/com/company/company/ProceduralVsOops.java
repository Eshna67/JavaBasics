package com.company;

public class ProceduralVsOops<rad> {
    //Procedural Programming
//    public static float radius = 10.0f; //Parameter = radius Argument = 10f
//    A parameter is the variable that goes as an input during the declaration of a method, which is radius in this case while declaring the method in Circle class. An argument is the actual value that goes as an input while calling that method. So, 10f would be the argument in this case.
//    You can say that arguments are data that are passed into a method’s parameters.
//    public static void main(String[] a){
//        System.out.println(area(radius));
//    }
//
//    public static float area(float radius){
//        return 3.141f * radius * radius;
//    }
    //As a good practice, keep the public static void main method in a separate class that was named Main

    //OOPS Concept
    public static float radius = 10.0f;
    public static void main(String[] a){
        System.out.println(Circles.area(radius));
//        Whenever you need to assign values to the variables of a particular class, or call the methods of that class, you can do it in the main method. Since variables/methods are declared in a different class, and accessed/called in a different class, you need to use the dot operator to do this.
    }
}

class Circles{
    public static float area(float radius){
        return 3.141f * radius * radius;
    }
    }

