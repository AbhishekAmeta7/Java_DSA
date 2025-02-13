import java.util.*;
public class Recursion3 {
    public static void printN(int start, int end) {
        if(start>end) {
            return;
        }
        System.out.print(start+" ");
        printN(start+1, end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter Ending index: ");
        int end = sc.nextInt();
        printN(start, end);
    }
}
