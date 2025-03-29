package Array;
import java.util.*;
public class Babhi{
    public static void update(int marks[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< marks.length; i++){
            marks[i] = sc.nextInt();
            marks[i] = marks[i] + 1;
        }sc.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:-");
        int input = sc.nextInt();
        System.out.println("Enter values of an array:-");
        int marks[] = new int[input];
        update(marks);
        for(int i =0; i<marks.length; i++){
            //System.out.println(marks[i] +" ");
        }System.out.println(Arrays.toString(marks));
        System.out.println();
    sc.close();
}
}