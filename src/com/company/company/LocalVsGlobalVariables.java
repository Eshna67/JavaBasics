package company;

public class LocalVsGlobalVariables {
    String name="Tom"; //Global variable inside a Class variable
    int age=25;
    public static void main(String[] args) {
        int i=10; //local variable for main method
        System.out.println(i);
         LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
        System.out.println(obj.name); //To access the GV, We need to create an object
        System.out.println(obj.age);
        int n=obj.sum(); //after storing in n, need to print otherwise, it won't be printed
        System.out.println(n);
        //System.out.println(j); //can't access since it is LV of sum method
    }
    public int sum(){
        int i=20; //local variable for sum method
        int j=30; //all these have scope inside only sum method
        int age=35;
        System.out.println("why"); //  it will not print until we store it in any variable in main class, doing in "test"
        return age;
    }
}
