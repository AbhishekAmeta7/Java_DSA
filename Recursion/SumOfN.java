import java.util.*;
public class SumOfN {
    public static int sumOfNatural(int n) {
        if(n==0){
            return 0;
        }
        return sumOfNatural(n-1)+n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth Term: ");
        int n = sc.nextInt();
        System.out.println("Sum Of "+n+" Natural Number: "+sumOfNatural(n));

    }
}
