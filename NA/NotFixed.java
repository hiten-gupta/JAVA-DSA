import java.util.*;
public class NotFixed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows:- ");
        int drive = sc.nextInt();
        System.out.println("Enter number of column:- ");
        int input = sc.nextInt();
        int[][] number = new int[drive][input];
        // take input
        for(int row =0; row < number.length; row++){
            for(int coln = 0; coln< number[row].length;coln++){
              System.out.println("Enter element at row" + (row + 1) + "and column" + (coln + 1) + ":");
                number[row][coln] = sc.nextInt();
            }
        }//output of array after filling
        for(int row = 0; row < number.length; row++){
            System.out.println(Arrays.toString(number[row]));
        }sc.close();
    }
        }
    

