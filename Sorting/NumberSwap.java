package Sorting;
import java.util.*;
public class NumberSwap {
    public static void swap(int number[]){
        int start = 0, end = number.length-1;
        while(start < end){
            int temp = number[end];
            number[end] = number[start];
            number[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int in = sc.nextInt();
        int number[] = new int[in];
        System.out.println("Enter element of array:- ");
        for(int i=0; i<number.length; i++){
            number[i] = sc.nextInt();
        }        
        swap(number);
        System.out.println("Number after swapping:- " +Arrays.toString(number));
        sc.close();
    }
}
