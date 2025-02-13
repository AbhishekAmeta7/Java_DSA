import java.util.*;
public class RecursionArray {
    public static void printArr(int[] arr , int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        printArr(arr, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printArr(arr,0);
    }
}
