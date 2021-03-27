import java.util.Scanner;

public class MoveAllZerosToTheEndOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        int index = 0;
        // Suppose there are k non-zero integers in the given n integers, then store that k non-zero integers at
        // first k positions in the array. Then store zeros at remaining positions.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[index++] = arr[i];
        }
        for (int i = index; i < arr.length; i++)
            arr[i] = 0;
    }
}
