import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList <Float> ();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        //Create an ArrayList using Generics here

        printArray(random);
    }

    public static void printArray(ArrayList <Float> check) {
        for (Float f:check)
            System.out.println(f); // replace f by check, it will return array

        //Complete the method declaration here

    }
}
