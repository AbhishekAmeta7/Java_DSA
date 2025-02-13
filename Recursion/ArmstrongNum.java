import java.util.*;
public class ArmstrongNum {
    static int reverse = 0;
    public static int isArmstrong(int num) {
        if(num==0){
            return reverse;
        }
       reverse=reverse+(num%10)*(num%10)*(num%10);//321
       return isArmstrong(num/10);//1

    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num==isArmstrong(num)){
            System.out.println(num + " is an Armstrong number.");
        }
        else{
            System.out.println(num + " is not an Armstrong number.");
        }
    }    
}
