package InheritanceProject;
//a subclass of Student
public class OnlineStudent extends Student{ //comes under Inheritance OOPS principle
String platform="Coursera";
double costpersubject=90;
double total=0.0;

    @Override // comes under Polymorphism OOPS principle
    public void name() {

        System.out.println("I am an Online Student");
    }

    //method with one parameter
public void print(int num) {

    //If I need to change the college name of Online Student
    printData(); //access the parent's method
    System.out.println("Platform used: "+platform);
    total=costpersubject*num;
    System.out.println("Total Learning Cost: "+total);
}


}
