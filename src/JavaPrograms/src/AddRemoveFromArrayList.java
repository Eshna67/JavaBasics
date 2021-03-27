import java.util.ArrayList;

public class AddRemoveFromArrayList {
    public static void main(String[] args) {
        //To add and remove methods to replace the fourth element (10) with 15?
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.remove(3);
        random.add(3, 15f);
        //Write new statements here

        printList(random);
   }

//a[i]
    public static void printList(ArrayList<Float> arr) {
        for (Float u : arr) {
            System.out.println(u);
        }
    }
}