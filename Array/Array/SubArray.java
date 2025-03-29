import java.util.*;

public class SubArray {
    public static void Array(int numbers[]){
        for(int i =0; i<numbers.length;i++){
        for(int j = i; j<numbers.length; j++){
        for(int k = i; k <= j; k++){
            System.out.print(numbers[k] + "  ");
        }
        System.out.println();
        }
        System.out.println();
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int in = sc.nextInt();
        int numbers[] = new int[in];
        System.out.println("Enter number in array:-");
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Your subarrays are:- ");
        Array(numbers);
        sc.close();
    }
}
