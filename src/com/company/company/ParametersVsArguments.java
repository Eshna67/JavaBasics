package company;

public class ParametersVsArguments {
    public static void main(String[] args) {
        System.out.println(Circ.circumference(10f)); //10f --Argument
    }
}

class Circ {
    public static float circumference(float radius) { // Radius -- Parameter
        return 2f * 3.14f * radius;
    }
}
/*
Parameter = radius, Argument = 10f
A parameter is the variable that goes as an input during the declaration of a method, which is radius in this case while declaring the method in Circle class.
 An argument is the actual value that goes as an input while calling that method. So, 10f would be the argument in this case.

 You can say that arguments are data that are passed into a method’s parameters.

 */