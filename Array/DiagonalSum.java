import java.util.*;
public class DiagonalSum {
    public static int matrix(int[][]ap){
        int sum =0;
        // for(int i=0;i<ap.length;i++){
        //     for(int j=0;j<ap[0].length;j++){
        //         if(i == j){
        //             sum += ap[i][j];
        //         }
        //         else if(i +j == ap.length-1){
        //             sum += ap[i][j];
        //         }
        //     }
        // }
        for(int i =0;i<ap.length;i++){
            sum +=  ap[i][i];
            if( i!= ap.length-1-i)
                sum += ap[i][ap.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:-");
        int in = sc.nextInt();
        int col = sc.nextInt();
        int[][] ap = new int[in][col];
        System.out.println("Enter values of array:-");
        for(int i=0;i<ap.length;i++){
            for(int j=0;j<ap.length;j++){
                ap[i][j] = sc.nextInt();
            }
        }
        int n = matrix(ap);
        System.out.println("Sum:"+n);
    sc.close();
}
}
