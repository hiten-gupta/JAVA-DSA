import java.util.*;
public class SprialMatrix {
    public static void matrix(int store[][]){
     int startRow =0;
     int startColn = 0;
     int end = store.length-1;
     int endColn = store[0].length-1; 
     while(startRow<= end && startColn<=endColn){
        //top
        for(int j = startColn; j<=endColn;j++){
            System.out.print(store[startRow][j] +" ");
        }
        //right
        for(int i = startRow+1;i<=end;i++){
            System.out.print(store[i][endColn] + " ");
        }
        //bottom
        for(int j = endColn-1;j>=startColn;j--){
            if(startRow == end){
                break;
            }
            System.out.print(store[end][j] +" ");
        }
        //left
        for(int i = end-1;i>=startRow+1;i--){
            if(startColn == endColn){
                break;
            }
            System.out.print(store[i] [startColn] +" ");
        }
        startColn++;
        startRow++;
        endColn--;
        end--;
     }
     System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int out = sc.nextInt();
        int [][] store = new int[in][out];
        //input 
        for(int i = 0; i<store.length;i++){
            for(int j= 0; j<store.length;j++){
                store[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0; i<store.length;i++){
            for(int j=0; j<store.length;j++){
                System.out.print(store[i][j] +" ");
            }
            System.out.println();
        }
        matrix(store);
        sc.close();
    }
}
