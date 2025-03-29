import java.util.*;
public class SpiralMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> result = spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
        sc.close();
    }
    public static List<Integer> spiralOrder(int[][] input) {
        ArrayList<Integer> result = new ArrayList<>();
        if(input == null || input.length==0)
             return result;
        int top = 0, left =0, right = input[0].length-1, bottom = input.length-1;
        while(top<=bottom && left<=right){
            for(int i = left;i <=right; i++){
                result.add(input[top][i]);
                System.out.println("Current result after adding 1 " + input[top][i] + ": " + result);
            }
            top++;
            for(int i = top; i<= bottom; i++){
                result.add(input[i][right]);
                System.out.println("Current result after adding 2 " + input[i][right] + ": " + result);
            }
            right--;
            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    result.add(input[bottom][i]);
                    System.out.println("Current result after adding 3 " + input[bottom][i] + ": " + result);
                }
                bottom--;
            }
                if(left<=right){
                    for(int i= bottom; i>=top; i--){
                        result.add(input[i][left]);
                        System.out.println("Current result after adding 4 " + input[i][left] + ": " + result);
                    }
                    left++;
                }
        }
        return result;
    }
}