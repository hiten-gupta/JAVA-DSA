package Sorting;
import java.util.*;
public class coumting {
    public static void counting( int[] sort){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<sort.length; i++){
            largest = Math.max(largest,sort[i]);
        }
        int count[] = new int[largest+1];
        for(int i =0; i<sort.length; i++){
            count[sort[i]]++;
        }
        int j=0;
        for(int i =0; i<count.length;i++){
            while(count[i]>0){
                sort[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:- ");
        int in = sc.nextInt();
        int sort[] = new int[in];
        System.out.println("Enter number in array:- ");
        for(int i=0;i<sort.length;i++){
            sort[i] = sc.nextInt();
        }
        counting(sort);
        System.out.println("Your array after sorting:- ");
        for(int index:sort){
            System.out.print(index+" ") ;
        }
        sc.close();
    }
}
