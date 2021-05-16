import java.util.Scanner;
public class Sequence1 {

    public int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2))%10;
    }
    //If we type 100, it will take a lot of time to compile the o/p and will not execute. Here, we need to do the analysis of algorithm
/*
As you learnt already, the algorithm follows an exponential time of O(2 raised to the power n).
For an input size of n = 100, this will take around 2 raised to the power 100
additions, which will take some time to process the output. Most compilers have some time limit
to process the output after which the time limit given will be exceeded.
Therefore, using this algorithm, you will not be able to find the outputs for large values
 */
    public static void main(String args[]) {
        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sequence1 sequence = new Sequence1();
        int number = sequence.fibonacci(n);
        System.out.println("Fibonacci number:  " + number);
    }
    /*
  In the first algorithm, the function follows a recursive procedure to generate the Fibonacci number,
but it does not store any of the values. We recalculated the same values at different instances,
which increase the number of operations while executing this algorithm. However, in the second algorithm,
declaring an extra array variable to store all the Fibonacci numbers reduces the redundant operations
while executing the algorithm
     */
}
