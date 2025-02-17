import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][]arr = new int[row][col];
        for(int i = 0; i< row; i++){
            for(int j = 0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(array(arr,target));
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(Arrays.toString(binary(arr,target)));
        sc.close();
    }
    public static boolean array(int[][]arr, int target){
        for(int i =0;i<arr.length; i++){
            for(int j =0; j<arr[i].length;j++){
                if(arr[i][j] == target) return true;
            }
        }
        return false;
    }
    public static int[] search(int [][]arr, int target){
        int row = 0, col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col] == target) {
                return new int[]{row,col};
            }
            if(arr[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
    //to search in between the row given between coloumn given
    public static int[] divide(int[][] arr, int row, int cStart, int cEnd, int target){
        while(cStart < cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(arr[row][mid] == target) return new int[]{row,mid};
            if(arr[row][mid] < target) cStart = mid +1;
            else cEnd = mid -1;
        }
        return new int[]{-1,-1};
    }
    public static int[] binary(int[][]arr, int target){
        int row = arr.length, cols = arr[0].length-1;
        if(row == 1) return divide(arr, 0, 0, cols -1, target);
        /// to filter out remaing two rows where target element lies
        int rStart = 0;
        int rEnd = row -1;
        int cMid = cols /2;
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if(arr[mid][cMid]== target) return new int[]{mid, cMid};
            if(arr[mid][cMid] <  target){
                 rStart = mid;
        }
            else 
               rEnd = mid;
        }
        if(arr[rStart][cMid] == target) return new int[]{rStart,cMid};
        if(arr[rStart+1][cMid] == target) return new int[]{rStart+1,cMid};
        if(target <= arr[rStart][cMid-1]) 
            return divide(arr, rStart, 0, cMid-1,target);
        if(target >= arr[rStart][cMid+1] && target <= arr[rStart][cols-1])
                return divide(arr, rStart,cMid+1, cols -1,target);
        if(target <= arr[rStart+1][cMid-1])
             return divide(arr, rStart +1,0,cMid -1, target);
        if(target >= arr[rStart+1][cMid+1]&& target <= arr[rStart+1][cols-1])
            return divide(arr, rStart +1, cMid+1,cols - 1,target);
        return new int[]{-1,-1};
    }
}
