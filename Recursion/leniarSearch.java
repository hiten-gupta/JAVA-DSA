import java.util.*;
public class leniarSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int index = 0;
        System.out.println(search(arr,k, index));
    }
    public static boolean search(int[] arr, int k, int index){
        if(index == arr.length) return false;
        return arr[index] == k || search(arr, k , index +1);
    }
}
