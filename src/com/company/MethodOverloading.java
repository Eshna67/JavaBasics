package com.company;

public class MethodOverloading {
    //When the method name is same with diff arguments/input param withing the SAME CLASS
    public static void main(String[] args) {
//To call below non-static methods, creating an object
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(10);
        obj.sum(20,30);

    }
    //You cannot create duplicate methods, but with diff param, can DO
    public  void sum() //0 input parameter
    {
        System.out.println("SUM Method--Zero param");
     //   public void test() -- You cannot create a method inside a method
    }
    public void sum(int i) //1 input param
    {
        System.out.println("SUM method--one param");
        System.out.println(i);
    }
    public void sum(int k, int l) //2 input param
    {
        System.out.println("SUM method--two param");
        System.out.println(k+l);
    }

    public static void main(int n) {
//        NOTICE you can OVERLOAD main method BUT with diff param type
    }
}
