import java.util.*;
public class Range {
    public static int find(int[] range, int key){
        int start =0, end =range.length-1;
        if(range.length ==0){
            return -1;
        }
        for(int index  = start; index <= end; index++){
            int elemnt = range[index];
            if(elemnt == key){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter size of array:- ");
        int  in = sc.nextInt();
        int [] range = new int[in];
        System.err.println("Enter element in array:- ");
        for(int i = 0; i<range.length; i++){
            range[i] = sc.nextInt();
        }
        System.out.println("Enter element you are looking for: -");
        int key =  sc.nextInt();
        System.out.println("Number looking for found on index:- " + find(range,key));
        
        
        sc.close();
    }
}
