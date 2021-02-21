package InheritanceProject;

class CheckNow {
    int x=10,y=20,z;
    public int numbers() {
        z=(x+y)*2;
        return z;
    }
    public void outp() {
        System.out.println(z);
    }
}
public class Maths extends CheckNow {
    @Override
    public void outp() {
     int x=10,y=19;
     int c=x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Maths m= new Maths();
        m.numbers();
        m.outp();
    }
}
