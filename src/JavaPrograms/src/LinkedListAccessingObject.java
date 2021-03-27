import java.util.LinkedList;

public class LinkedListAccessingObject {
    public static void main(String[] args) {
        LinkedList<Pupils> studentList = new LinkedList<Pupils>();

        Pupils s1 = new Pupils("Sujit", 1);
        Pupils s2 = new Pupils("Siddharth", 2);
        Pupils s3 = new Pupils("Karanpreet", 3);
        Pupils s4 = new Pupils("Hari", 5);
        Pupils s5 = new Pupils("Tricha", 4);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
//Write statements using the get method, to print the details of the student at index 1 in this list using Linked List
        Pupils s = studentList.get(1);
        System.out.println(s.getDetails());
    }

    public static void printStudentList(LinkedList<Pupils> students) {
        for(Pupils s : students) {
            System.out.println(s.getDetails());
        }
    }
}

class Pupils {
    private final String name;
    private final int rollNumber;

    public Pupils(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}