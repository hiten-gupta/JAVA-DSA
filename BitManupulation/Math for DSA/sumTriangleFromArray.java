import java.util.*;
public class sumTriangleFromArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        triangleArray(arr);
        sc.close();
    }    
    public static void triangleArray(int[]arr){
        if(arr.length<1)
           return;
        int [] temp = new int[arr.length-1];
        for(int i =0; i< arr.length-1;i++){
            temp[i] = arr[i] + arr[i+1];
        }
        triangleArray(temp);
        System.out.println(Arrays.toString(arr)); 
    }
}
