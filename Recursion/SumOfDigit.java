import java.util.*;
public class SumOfDigit {
    public static int sum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int small = sum(n/10);
        int add = small+n%10;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum Of Digits: "+sum(n));
        
    }
}
