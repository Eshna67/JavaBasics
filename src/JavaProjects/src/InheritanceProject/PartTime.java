package InheritanceProject;

public class PartTime extends Student{ //When more than one class inherits from more than one class it is called Hierarchical Inheritance
//instance variables
    String dayOfClass;
    String timeOfClass;
    String occupation;

    @Override
    public void name() {
        System.out.println("I am a Part Time Student");
    }

    public void output() {
        printData();
        System.out.println("Day of Class: "+dayOfClass);
        System.out.println("Time of Class: "+timeOfClass);
        System.out.println("Occupation: "+occupation);
    }
}
