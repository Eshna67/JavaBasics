package company;

public class StaticAndNonStatic {
    //Global Variables : The scope of GV will be available a/c all teh functions with some conditions.
    String name="Tom"; //non-static global variable
    static int age=29; //static GV

    public static void main(String[] args) {
        // how to call static methods and var?
        //1. direct calling
        sum();
        //2. calling by classname
        StaticAndNonStatic.sum();
        System.out.println(age); //calling static variable directly
        System.out.println(StaticAndNonStatic.age); //calling stat var through class

        //how to call non static methods and var - by creating obj
        StaticAndNonStatic obj=new StaticAndNonStatic();
        obj.check();
        System.out.println(obj.name); //calling non static

        //can i access static variable by using object reference ? Yes but this is not a good practica as it throws warning and should be done by above 2 ways
        obj.sum();

    }
    public void check(){
        System.out.println("check this method"); //non static method
    }
    public static void sum(){
        System.out.println("Sum method"); //static method
    }

}
