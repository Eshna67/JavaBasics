import java.util.*;

class Rectangles{
    //old method
    @Deprecated
    public void showNameOfClass(){
        System.out.println("Rect");
    }
    public void printNameOfClass(){
        System.out.println("Rectangle");
    }
}
public class DeprecatedAnnotation{
    public static void main(String[] args){
        Rectangles r = new Rectangles();
        r.showNameOfClass();
        r.printNameOfClass();
    }
}
/*

@Deprecated annotation is used to mark a piece of code that should not be used to write new code.
If your code includes the deprecated code, the compiler will show a warning.

Advantages of @Deprecated annotation
- Warns the team/programmer against the deprecated elements
- Helps in maintaining the hygiene of the code

 */