import java.util.*;
public class MaxSubarray {
    public static void add(int num[]){
       int curr  =0;
       int max = Integer.MIN_VALUE;
       for(int i =0;i<num.length; i++){
        for(int j = i; j<num.length;j++){
            curr = 0;
            for(int k =i; k<= j; k++){
                curr += num[k];
            }
            System.out.println(curr);
            if(max < curr){
                max = curr;
            }
        }
       }
       System.out.println("max sum:- " + max);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int in =sc.nextInt();
        int num[] = new int[in];
        System.out.println("Enter number in array:- ");
        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(num));
        add(num);
        sc.close();
    }
}
