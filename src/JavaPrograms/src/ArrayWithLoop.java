public class ArrayWithLoop {
    public static void main(String[] args) {
        String a[] = {"eshu", "tom","jerry"};
        b(a);
    }
    public static void b(String[] c)
    {
        for (String s : c) {
            System.out.println(s);
        }
    }

}
