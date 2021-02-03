class Main {
    public static void main(String[] args) {
//        check obj=new check();
        check.radius=2.0;
        //obj.findArea(2);
      //  double area = check.findArea(2);
        System.out.println("Area of circle is ");
    }
}
public class check {
    public static double radius; // As soon as we make radius static, able to access in main class via Classname
    public double findArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }
}
