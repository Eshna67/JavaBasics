import java.util.Scanner;
public class Sequence2 {
    public void fibonacci(int n) {
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++)
            f[i]=(f[i-1]+f[i-2])%10;
        System.out.println("Fibonacci number : "+f[n]);
    }
    public static void main(String args[]) {
        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sequence2 sequence = new Sequence2();
        sequence.fibonacci(n);
    }
}
/*
Algorithm 2 uses an array variable f[], stores the calculated values for each iteration of the for loop (i) and,
 finally, prints the nth number of the function. The time complexity of algorithm 2 is a linear function that is
  relatively more efficient than the exponential function of algorithm 1. Therefore, algorithm 2 is able to process
   the output for n = 100 in an instant.
 */