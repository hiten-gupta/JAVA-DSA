import java.util.*;
public class TwooArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in 3*3 matrix:- ");
        int[][] matrix= new int[3][3];
        //outer for loop for itrating each row by 1 and comparing the
        for(int row = 0; row < matrix.length; row++){
            //inner for loop for itrating each column by 1 same as outer for loop
            for(int coln = 0; coln < matrix[row].length;coln++ ){
                matrix[row][coln] = sc.nextInt();
            }
            
        }
        // for(int row = 0; row < matrix.length; row++){
        //     for(int coln = 0; coln < matrix[row].length;coln++ ){
        //         System.out.print(matrix[row][coln] + " ");
        //     }System.out.println();
        // }
        // for(int row = 0; row<matrix.length; row++){
        //     System.out.println(Arrays.toString(matrix[row]));
        // }
        for(int[] yatri : matrix){
            System.out.println(Arrays.toString(yatri));
        }
        sc.close();
    }
}
