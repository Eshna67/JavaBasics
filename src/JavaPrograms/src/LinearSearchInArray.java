import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        boolean test = false;
        for (int element : arr) {
            if (element == k) {
                test = true;
                break;
            }
        }
        System.out.println("Is " + k
                + " present in the array: " + test);
    }
}




