import java.util.Scanner;

public class substringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int n = s.length();
        // Complete the function
        for (int j = 1; j < n - k + 1; j++) {
            String p = s.substring(j, j + k);
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) > smallest.charAt(i))
                    break;
                else if (p.charAt(i) == smallest.charAt(i))
                    continue;
                else {
                    smallest = p;
                    break;
                }
            }


            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) < largest.charAt(i))
                    break;
                else if (p.charAt(i) == largest.charAt(i))
                    continue;
                else {
                    largest = p;
                    break;
                }
            }
        }

        return smallest +"\n"+largest;
}
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }


