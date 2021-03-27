import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Iterator;

public class WithListIterator1 {

    public static void main(String[] args) {

        List<duplicateStudent> studentList1 = new ArrayList<duplicateStudent>();
        duplicateStudent s1 = new duplicateStudent("Sujit",1);
        duplicateStudent s2 = new duplicateStudent("Siddharth",2);
        duplicateStudent s3 = new duplicateStudent("Karanpreet",3);
        duplicateStudent s4 = new duplicateStudent("Hari",5);
        duplicateStudent s5 = new duplicateStudent("Tricha",4);

        studentList1.add(s1);
        studentList1.add(s2);
        studentList1.add(s3);
        studentList1.add(s4);
        studentList1.add(s5);

        iterateFwd(studentList1);
    }

    private static void iterateFwd(List<duplicateStudent> students) {
        ListIterator<duplicateStudent> it = students.listIterator();
        //ListIterator is a method in List class
        System.out.println("Printing student list...");
        while(it.hasNext()) {
            System.out.println(it.next().getDetails());
        }
    }
}
class duplicateStudent {
    private final String name;
    private final int rollNumber;

    public duplicateStudent(String name, int rollNumber) {
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
Iterator is an interface in Java, which is used to iterate over a collection of objects.
You can think of an ‘iterator’ as a cursor to an element in a collection. Also, you can use the ‘iterator’ (or the cursor) to move to the next element in the collection.

ListIterator is a subinterface of the Iterator interface, which is used to iterate over a list.
It has a lot more features than the Iterator interface. These features are given below:

It is used to traverse a list in any direction, i.e. forward or backward, very easily.

It doesn’t point to any current element; its cursor position always lies between the previous and next elements (Figure 1 given below).

It has methods to find out if there exists a next or previous element and to find the value of this next or previous element, as well as its indices.
 */
