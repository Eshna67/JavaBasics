public class Sequence3 {

    public static int fibonacci(int n) {
        int a = 0, b = 1, c = n;
        for (int i=2; i<=n; i++){
            c = (a + b);
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Sequence3 fibonacci = new Sequence3();
        System.out.println(Sequence3.fibonacci(100000));
    }

}