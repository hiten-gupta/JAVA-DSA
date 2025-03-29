import java.util.*;
public class sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i= 0; i< input; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println(sort(arr, 0));
        sc.close();
     }
     static boolean sort(int[] arr, int index){
        if(index == arr.length-1) return true;

        return arr[index] < arr[index +1] && sort( arr, index +1);
     }
}
