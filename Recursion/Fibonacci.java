import java.util.*;
public class Fibonacci {
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int pre1 = fibo(n-1);
        int pre2 = fibo(n-2);
        return pre1+pre2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print(fibo(i)+" ");
        }
    }
}
