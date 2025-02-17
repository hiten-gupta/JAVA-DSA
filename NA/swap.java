//import java.util.Scanner;
import java.util.Arrays;
public class swap {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value for a :->");
//         int a = sc.nextInt();
//         System.out.print("Enter value for b :->");
//         int b = sc.nextInt();
// //program written for swapping two numbers in simple manner
//         // int temp = a;
//         // a = b;
//         // b = temp;
//         Swap(a, b);

//         System.out.println(a +" "+ b);
//         sc.close();
//     }

//     static void Swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;

     System.out.println("Enter the size of an array:- ");
    
      int[] number = {1,5,1,8,6,1,6};
      change(number);
      System.out.println(Arrays.toString(number));
    }
    
    static void change (int[] nums){
        nums[0] = 99;
        
    }
}

