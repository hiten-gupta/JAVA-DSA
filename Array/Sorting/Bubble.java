package Sorting;
import java.util.*;
public class Bubble {
    public static void man(int sort[]){
        for(int i = 0; i<sort.length-1; i++){//input 5 4 1 3 2
            System.out.println("First pass:-"+sort[i]);
            for(int j =0; j<sort.length - 1 -i; j++){
                 System.out.println("Second pass:- "+sort[j]);
                if(sort[j]>sort[j+1]){
                    int temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter array size:-");
       int in = sc.nextInt();
       int sort[] = new int[in];
       System.out.println("Enter size of element:-");
       for(int i =0; i<sort.length; i++){
        sort[i] = sc.nextInt();
       }
       man(sort);
       System.out.println("Sorted array:- ");
       for(int i =0; i<sort.length; i++){
        System.out.print(sort[i] + " ");
       }
       sc.close();
    }
}
