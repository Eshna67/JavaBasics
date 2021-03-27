package InheritanceProject;

import java.sql.SQLOutput;

//Driver Class
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.studenId = 1;
        s.subjects = new String[]{"His", "Eng"}; // or, we can create a new -String[] sub={"His","Eng"}; s.subjects=sub;
        System.out.println("Super class Student Output");
        //s.name();
        s.printData();
        System.out.println();

        OnlineStudent on = new OnlineStudent();
        on.studenId = 2;
        Student.collegename = "CU"; //If I need to change the college name of only Online Student
        String[] onlineSub = {"Maths", "C", "Phy"};
        on.subjects = onlineSub;
        int number = onlineSub.length;
        System.out.println("Online Student Details");
        //on.name();
        on.print(number);//since it is parametrized
        System.out.println();
        PartTime obj =new PartTime();
        obj.occupation="Engineer";
        obj.dayOfClass="1";
        obj.timeOfClass="12.00PM";
        System.out.println("Part Time Student Details");
        obj.studenId=3;
        Student.collegename="DU";
        obj.subjects=new String[]{"Maths","Geo","Computer"};
        obj.printData();
        System.out.println();
        SpecialOnline obj1=new SpecialOnline();
        obj1.subjects=onlineSub;
        obj1.studenId=4;
       obj1.print(number);
       obj1.discount();

    }
}
