import java.util.*;
abstract class Book{
    String title;
    abstract void p(String s);
    String getTitle(){
        return title;
    }
}

//Write MyBook class here
class MyBook extends Book {
    String getTitle()
    {
        return title;
    }
    public void p(String title)
    {
        this.title=title;
    }
}

public class ab{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.p(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}