import java.util.*;

class Rectangle {
    public void printNameOfClass() {
        System.out.println("Rectangle");
    }
}

class Square extends Rectangle {
    // @Override
    public void printNameofClass() {
 /*
 Run this code:
 1) by commenting @Override with wrong methodName
 2) by using Override with wrog method
 ANnotations used to catch error during compile time
     Like in above case we used printNameofClass which is actually (of-Of), it will detect and help us.
     It will show Rectangle as input in case of 1)
         */
        System.out.println("Square");

    }
}

public class AnnotationDemo {
    public static void main(String[] args) {
        Square s = new Square();
        s.printNameOfClass();
    }

}