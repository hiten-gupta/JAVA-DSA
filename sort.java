import java.util.*;
public class sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(array(arr));
        sc.close();
    }
    public static boolean array(int arr[]){
        for(int i = 0; i< arr.length-1; i++){
            if(arr[i]> arr[i+1])
               return false;
        }
        return true;
    }
}