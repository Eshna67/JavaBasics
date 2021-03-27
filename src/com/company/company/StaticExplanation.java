package company;
public class StaticExplanation {
public static void main(String[] a){

        //Create two objects of Square class 's1' and 's2'
        Square s1 = new Square();
        Square s2 = new Square();
        s1.length=10.0f;
        s2.length=20.0f;

        //Calculate and print their areas after assigning values to their side lengths
    System.out.println("Area of sqaure: "+s1.area());
    System.out.println("Area of sqaure: "+s2.area());


        }
}

class Square {
    public float length;

    public float area() {
        return length * length;
    }
}
