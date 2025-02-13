import java.util.*;
public class SumOfArray {
    public static int sum(int[] arr , int i) {
        if(i==arr.length){
            return 0;
        }
        return arr[i] + sum(arr , i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Elements of Array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr,0));
    }
}
