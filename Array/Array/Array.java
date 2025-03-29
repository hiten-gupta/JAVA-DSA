import java.util.Arrays;
import java.util.Scanner;
public class  Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        //Array of primitive 
        //int[] number = new int[5];
        // number[0] = 98;
        // number[1] = 87;
        // number[2] = 76;
        // number[3] = 67;
        // number[4] = 56;
        //number[5] = 100;
        //System.out.println(number[4]);
        // String[] name = new String[4];
        // // System.out.println(name[2]);
        // System.out.println("Enter Array Element:- ");
        // for(int i = 0; i<number.length; i++){
        //     number[i] = sc.nextInt();
        // }
        // // for(int i = 0; i<number.length; i++){
        // //     System.out.print(number[i] + " ");
        // // }
        // for(int arr : number){ //for every element in array,print the element
        //     System.out.print(arr + " "); // here arr represents elements of the array
        // }
        // System.out.println(Arrays.toString(number));

        //Array of Objects
        // int define = sc.nextInt();
        //System.out.println("Enter the length you want to print:- ");
        String[] name = new String[5];
        System.out.println("Enter a String name of length:- ");
        for(int i = 0; i< name.length;i++){
            name[i] = sc.next();
        }
        System.out.println(Arrays.toString(name));

        sc.close();
    } 
}
 