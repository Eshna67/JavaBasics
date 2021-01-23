package com.company;

public class FunctionsinJava {
    public static void main(String[] args) {
//        main method -- starting point of execution
        FunctionsinJava obj1=new FunctionsinJava();
        //one object will be created, obj1 is the reference varoable, referring to this object
// After creating the onject, teh copy of all non static methods will eb given to this object
        obj1.test();
        int n=obj1.check();
        System.out.println(n);
        String test=obj1.checknow();
        System.out.println(test);
}
//    non static methods
//    void -- does not return any value
    //return type -- void
    public void test(){
        //no i/p no o/p
        System.out.println("test method");
    }
//    return -type -- int
    public int check(){
        System.out.println("check the int method, it is returning c only when we are storing this in variable n");
        int a=10;
        int b=90;
        int c=a+b;
        return c;
    }
    //return type -- String
    public String checknow(){
        String s= "yeahhh";
        System.out.println("test");
    return s;
    }

}
