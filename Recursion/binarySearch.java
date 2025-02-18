import java.util.*;
public class binarySearch{
    public static int Search(int[] inputNums, int target, int start, int end){
        if(start > end)
            return -1;
        int mid = start + (end - start) /2;
        if(inputNums[mid] == target)
               return mid;
        if(inputNums[mid] < target)
            return Search(inputNums, target, mid +1, end);
        return Search(inputNums, target, start, mid -1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int[] inputNums = new int[in]; 
        for(int i =0; i< in; i++){
            inputNums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Search(inputNums,target, 0,inputNums.length-1));
        sc.close();
    }
}