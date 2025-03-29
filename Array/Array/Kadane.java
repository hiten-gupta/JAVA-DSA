import java.util.*;
public class Kadane {
    public static void max(int store[]){
        int curr = 0; 
        int sum = Integer.MIN_VALUE;         
        for(int i = 0; i<store.length; i++){
            curr = curr + store[i];
            if(curr < 0){
                curr =0;
            }
             sum = Math.max(curr, sum);
        }
        System.out.println("Our max subarray sum is = " + sum);
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int in = sc.nextInt();
        int store[] = new int[in];
        System.out.println("Enter elements in array:- ");
        for(int i = 0; i<store.length; i++){
            store[i] = sc.nextInt();
        }
        max(store);
         sc.close();
    }
}