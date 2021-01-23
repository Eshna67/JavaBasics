package com.company;

public class WrapperClassConcept {
    public static void main(String[] args) {
        String x="900";
        System.out.println(x+20); //String Concatenation will happen

        //data conversion: String to int
        int i= Integer.parseInt(x);
        System.out.println(i+20); //converted to integer

        //Wrapper Classes--Integer, Double, Character, Boolean

        //String to double
        String y="12.33";
        double d=Double.parseDouble(y);
        System.out.println(d+10);

        //String to boolean
        String k="true";
        boolean b= Boolean.parseBoolean(k);
        System.out.println(b);

        //Int to String
        int j=200;
        System.out.println(j+20); //220

        String s=String.valueOf(j); //"200"
        System.out.println(s+20);

        //NOTE----You cannot convert String with alphanumeric value to INT
        //String u="200A";
        //Integer.parseInt(u); //It will throw Number Format Exception
    }
}
