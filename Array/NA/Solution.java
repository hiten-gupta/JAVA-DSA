import java.util.*;
class Solution{
    public static void hollow(int row, int coln){
        for(int i = 1; i<= row; i++){
            for(int j = 1; j<= coln; j++){
                if(i == 1|| i ==row || j == 1|| j == coln){
                    System.out.print("*");
                }else{
                    System.out.println("");
                }
            } System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int coln = sc.nextInt();
        hollow(row,coln);
        sc.close();
    }
}