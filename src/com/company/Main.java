package com.company;

public class Main {

    public static void main(String[] args) {
        // Left Shift Operator
        int a=5;//101
        int b= a<<2; //add zeros at last 10100 --> 20
        System.out.println("Usage of Left Shift Operator: "+b);
        // Right Shift Operator
        int c=5; //101
        int d= c>>2; //1
        System.out.println("Usage of Right Shift Operator: "+d);
        //Bitwise AND OR operator
        int e=b&c; //final value of b=20(10100) and c=5(101) >>00100 counts to 4
        System.out.println("Usage of AND Operator: "+e);
        int f=b|c;
        System.out.println("Usage of OR  Operator: "+f);
        //Boolean operators: boolean - primitive datatype, Boolean - wrapper class
        boolean g=true;
        g=!g;
        System.out.println("Usage of Boolean Operator: "+g);
        //Ternary Operators (replacement of If else ? Check next example)
        Object obj1;
        Object obj2;
        if (true)
        {
            obj1=new Integer(10);
        }
        else
        {
            obj1=new Double(15.0);
        }
        System.out.println("IfElse: "+obj1);
        //Ternary Operators Disadvantage -- It will check the datatype of both values, whichever is maximum will occupy that type
        obj2=true?new Integer(10):new Double(15.0); //true if:else
        System.out.println("Check diff b/w Ternary and IfElse: "+obj2);//In this case it occupied Double type since it is larger than Int
    }
}
