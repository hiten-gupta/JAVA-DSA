package Sorting;
import java.util.*;
public class PrefixSum {
    public static void max(int store[]){
        int curr = 0;
        int sum = Integer.MIN_VALUE;
        int prefix[] = new int[store.length];
        prefix[0] = store[0];
        // claculate prefix Sum:-
        for(int i =1; i< prefix.length; i++){
            prefix[i] = prefix[i-1] + store[i];
        }
        for(int i =0; i<store.length; i++){
            for(int j = i; j<store.length; j++){
                curr =i==0? prefix[j]:prefix[j] - prefix[i-1];
                if(sum < curr ){
                    sum = curr;
                }
            }
        }
        System.out.println("SUM:-" + sum);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of an array:- ");
        int in = sc.nextInt();
        int[] store = new int [in];
        System.out.println("Enter array element:- ");
        for(int i = 0; i<store.length; i++){
            store[i] = sc.nextInt();
        }
        max(store);
        sc.close();
    }
}
