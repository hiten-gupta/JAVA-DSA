package Sorting;
import java.util.*;
public class insertionSort {
    // public static void sort(int[] store) {
    //     for(int i = 1; i<store.length; i++){
    //         int curr = store[i];
    //         int prev = i-1;
    //         while(prev >= 0 && store[prev] > curr){
    //             store[prev +1 ] = store[prev];
    //             prev--;
    //         }
    //         store[prev+1] = curr;
    //     }
    // }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of array:- ");
        // Integer in = sc.nextInt();
        Integer store[] = {1, 2, 3, 4, 5};
        // System.out.println("Enter elements of array:- ");
        // for(int i= 0; i<store.length; i ++){
        //     store[i] = sc.nextInt();
        // // }
        // System.out.println();
        Arrays.sort(store,Collections.reverseOrder());
        for(int i =0; i<store.length;i++){
            System.out.print(store[i]+" ");
        }
        // sc.close();
    }
}
