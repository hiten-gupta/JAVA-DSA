import java.util.*;
public class TwoDArrays {
    public static boolean search(int[][]store,int key) {
        for(int i=0; i<store.length; i++){
            for(int j = 0; j<store[0].length; j++){
                if(store[i][j] == key){
                    System.out.println("Found at cell("+i+" " +j+ ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter size your row:- ");
        int in = sc.nextInt();
        System.out.println("Enter size of column:- ");
        int out = sc.nextInt();
        int [][] store = new int[in][out];
        for(int row =0; row<in;row++){
            for(int column =0; column<out; column++){
                System.out.println("Enter value for element [" + row +"][" + column +"]: ");
                store[row][column] = sc.nextInt();
            }
        }
        for(int row =0;row<in;row++){
            for(int column =0; column<out;column++){
                System.out.print(store[row][column]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter value to be found on index: ");
        int key = sc.nextInt();
        search(store, key);
    sc.close();

}
}
