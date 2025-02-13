import java.util.*;
class SearchArr {
    static boolean b;
    public static boolean search(int[] arr,int i,int target){
       if(i==arr.length){
           b = false;
           return b;
       }
       search(arr,i+1,target);
       if(arr[i]==target){
           b=true;
           return b;
       }
       return b;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target Element: ");
        int target = sc.nextInt();
        System.out.println(search(arr,0,target));
    }
}