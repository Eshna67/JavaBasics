import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
/*
 Since the ArrayList class can contain the elements of any data type, you can refer to its type as ‘Object’.
 Whenever you create the ArrayList of the Object data type, you need to typecast its elements to access them or use them to call methods.
 Now, all the elements of the ‘students’ ArrayList are of the type Object.
 You cannot access the getDetails( ) method of the Student class from ‘o’ since it is of the type Object.
 So, the type of the object o has to be typecast to Student to access the getDetails( ) method.
 That’s why line 1 is written, to typecast o into s, which is of the Student type.
 Then, you can access the method using s.getDetails( ).
 */
        ArrayList studentList = new ArrayList();

        studentList.add(new Student("Sujit", 1));
        studentList.remove(new Student("Siddharth", 2));
        studentList.add(new Student("Karanpreet", 3));
       // studentList.add("Hari"); //line2
        /*
        ClassCastException will occur in case you uncomment above line2
        Whenever an object of a particular type is typecasted into an unrelated type,
        it results in a typecast error.
        */
        printStudentList(studentList);
    }

    public static void printStudentList(ArrayList students) {
        for (Object o : students) {
            Student s = (Student) o; //line 1
            System.out.println(s.getDetails());
        }
    }
}

class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
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
  SUMMARY
  =======
  1. ArrayList Simple way to representation a dataset which is a collection of elementary data items.
      This is a type-unsafe approach of creating containers. We can add anything into the List which may
      result in a variety of runtime type errors.
  2. When printing, the ArrayList prints the elements in the same sequence as they had been inserted.
      In other words, ArrayList (and any other form of lists, including arrays) remember the sequence
      of insertion. This is an important property which can be safely exploited in the program design.
      There are other containers, e.g. Sets and Maps, where the sequence of insertion is of no
      consequence. A program using such containers must not depend on them to remember the sequence of
      insertion for its correctness.

  3. Using a non-generic ArrayList is type-unsafe.
*/
