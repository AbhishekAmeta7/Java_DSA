import java.util.*;
public class Recursion1{
    public static void printN(int n){
        if(n==0){
            return;
        }
        printN(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printN(n);
    }
}