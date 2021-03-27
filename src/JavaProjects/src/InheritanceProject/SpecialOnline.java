package InheritanceProject;
//MultiLevel Inheritance
//The only thing not allowed in Java is "You cannot have a subclass inheriting from more than one superclass"
public class SpecialOnline extends OnlineStudent{
    //instance variables
    double discountRate=0.3; //30%

    @Override
    public void name() {
        System.out.println("I am a Special Online Student");
    }
    public void discount() {
        double newtotal=total-(total*discountRate);
        System.out.println("Discounted Cost: "+newtotal);
    }
}
