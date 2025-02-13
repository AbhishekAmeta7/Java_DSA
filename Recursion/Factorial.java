import java.util.*;
public class Factorial {
    public static int calcFact(int n){
        if(n==0){
            return 1;
        }
        return calcFact(n-1)*n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int factorial = calcFact(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}