import java.util.Arrays;
import java.util.Scanner;

public class setMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of Columns");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i = 0;i<row; i++){
            for(int j= 0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("\nOriginal Matrix");
        printMatrix(matrix);
        setMatrix(matrix);

    }
    public static void setMatrix(int[][]mat){
        boolean startRow = false, startCol = false;
        for(int i = 0;i< mat.length; i++){
            for(int j = 0; j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    if(i == 0) startRow = true;
                    if(j == 0) startCol = true;
                    mat[0][j] = 0;
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println("\nAfter marking rows and columns:");
        printMatrix(mat);
        for(int i = 1; i< mat.length; i++){
            for(int j = 1; j<mat[0].length; j++){
                if(mat[i][0] == 0 || mat[0][j] == 0){
                    mat[i][j] =0;
                    
                }
            }
        }
        System.out.println("\nAfter setting matrix cells:");
        printMatrix(mat);

        if(startRow){
            for(int j = 0; j<mat[0].length; j++){
                mat[0][j] =0;
                
            }
        }
        System.out.println("\nAfter setting first row:");
            printMatrix(mat);
        if(startCol){
            for(int i = 0; i< mat.length; i++){
                mat[i][0] = 0;
            }
        }
        System.out.println("\nAfter setting first Column:");
            printMatrix(mat);
    }
     public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}
