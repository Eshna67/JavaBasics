public class toStringMethod {
    String name;
    int age;
    String course;

    public toStringMethod(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

//    @Override
//    public String toString() {
//        return name+" "+age+" "+course+" ";
//    }

    public static void main(String[] args) {
        toStringMethod obj=new toStringMethod("Eshu",23,"Java");
        //System.out.println(obj);
        System.out.println(obj.toString());
   }
}
/*
Explanation:In the above program, we create an Object of toStringMethod class
But when we try to print the Object, then we are getting some output which is in the form of
classname@HashCode_in_Hexadeciaml_form.
If we want the proper information about toStringMethod object,
then we have to OVERRIDE toString() method of Object class in our toStringMethod class.
 */