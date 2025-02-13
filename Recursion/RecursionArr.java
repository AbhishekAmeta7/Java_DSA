import java.util.Scanner;

public class RecursionArr {
    public static void printSumArr(int[] arr , int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]%2==0){
            System.out.print(arr[i] + " ");
        }
        printSumArr(arr, i+1);
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
        printSumArr(arr,0);
    }
}
