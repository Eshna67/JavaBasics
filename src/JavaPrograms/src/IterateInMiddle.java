import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateInMiddle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ListIterator iterator = list.listIterator();
//        for (int index = list.size() / 2; index < list.size(); index++) {
//
//            System.out.println(list.get(index));            }
        while (iterator.hasNext()) {
            while (iterator.nextIndex() < (list.size() / 2)) {
                System.out.println(iterator.next());
            }
        }
    }
}
