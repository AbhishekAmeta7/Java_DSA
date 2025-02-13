import java.util.*;
public class Recursion2{
    public static void printN(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        printN(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printN(n);
    }
}