import java.util.Scanner;

public class codechef1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        for (int i=10;i>=1;i--) {
            if (N%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
