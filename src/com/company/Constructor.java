package com.company;

public class Constructor {
    public static void main(String[] a){
        Circl c1 = new Circl(10f);
       // c1.radius=10f; //If constructor is not there, them each time we need to initialize by writing two sentences
        System.out.println("area of circle = " + c1.area());

        Circl c2 = new Circl(20f);
        System.out.println("area of circle = " + c2.area());

        Circl c3 = new Circl(15f); //
        System.out.println("area of circle = " + c3.area());
    }
}

class Circl{
    public float radius;
//The below Circl is a Constructor that is helping in initializing of variable  in main method
    public Circl(float r) {
        radius = r;
        //Usage of THIS keyword - The 'this' keyword is used to refer to the current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem.
//        public Circl(float radius)
//        {
//            this.radius=radius;
//        }
    }
    //r is the parameter that goes as an input in this constructor.
    // Whatever argument is passed while creating a new object passes as a parameter and gets assigned to the instance variable radius.
    // This is how variables are initialised while creating a new object.

    public float area(){
        return 3.141f * radius * radius;
    }
}
