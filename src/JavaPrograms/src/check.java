class Main {
    public static void main(String[] args) {
        check obj=new check();
        obj.getRadius();
        //obj.findArea(2);
      //  double area = check.findArea(2);
        System.out.println("Area of circle is "+obj.getRadius());
    }
}
//Static methods can be called without creating any objects
public class check {
    private static double radius=3;
    public double getRadius(){
        return radius;
    }// As soon as we make radius static, able to access in main class via Classname
    public final double findArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }
}
