package InheritanceProject;
//super class
public class Student {
    //Instance Variables
    static String collegename = "DTU";
    String designation = "student";
    int studenId;
    String[] subjects;

    public void name(){
        System.out.println("I am a Student");
    }

    //output method
    public void printData()
    {
        name();
        System.out.println("College: " + collegename);
        System.out.println("Designation: " + designation);
        System.out.println("ID: " + studenId);
        System.out.println("Subject: ");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + " ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        try {
            Student obj = new Student();
            obj.printData();
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught"); //because subject array is empty
        }
    }
}