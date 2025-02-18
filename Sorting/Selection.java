package Sorting;
import java.util.*;
public class Selection {
    public static void selection(int sort[]){
        for(int i = 0; i<sort.length-1; i++){
            int min = i;
            for(int j =i+1; j<sort.length;j++){
                if(sort[min] > sort[j]){
                    min = j;
                }
            }
            int temp = sort[min];
            sort[min] = sort[i];
            sort[i]= temp;
        }
        Arrays.sort(sort);
     }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int in = sc.nextInt();
        int sort[] = new int[in];
        System.out.println("Enter elements in array:-");
        for(int i =0; i<sort.length; i++){
            sort[i] = sc.nextInt();
         }
        System.out.println("Sort of enter element:- ");
      selection(sort);
      for(int index: sort){
        System.out.print(index + " ");
      }
        sc.close();
    }
} 
