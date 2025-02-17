import java.util.*;
public class SortArray {
    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length -1|| arr.length<=1){
            return true;
        }
        if(arr[index] >arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
        sc.close();
    }
}
