import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
public class LinkedArrayList {
    public static void main(String[] args) {
        List<checkTheDiference> studentList1 = new ArrayList<checkTheDiference>();
        List<checkTheDiference> studentList2 = new LinkedList<checkTheDiference>();
       /* List<Student> studentList = new List<Student>();
          The above will throw error if you uncomment because-
          Interfaces cannot be instantiated by themselves.
          They require classes for their implementations.
        */

        checkTheDiference s1 = new checkTheDiference("Sujit",1);
        checkTheDiference s2 = new checkTheDiference("Siddharth",2);
        checkTheDiference s3 = new checkTheDiference("Karanpreet",3);
        checkTheDiference s4 = new checkTheDiference("Hari",5);
        checkTheDiference s5 = new checkTheDiference("Tricha",4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);

        studentList2.add(s4);
        studentList2.add(s5);

        printStudentList(studentList1);
        printStudentList(studentList2);


    }

    public static void printStudentList(List<checkTheDiference> students) {
        System.out.println("Printing student details.....");
        for(checkTheDiference s : students) {
            System.out.println(s.getDetails());
        }
    }
}

class checkTheDiference {
    private final String name;
    private final int rollNumber;

    public checkTheDiference(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}
/*
 List is an interface that is implemented by the ArrayList and LinkedList classes.
 This is the reason why you can instantiate both 'ArrayList' and 'LinkedList' by declaring the
 type of variable as List.
 */