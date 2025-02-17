import java.util.*;
public class Largest{
    public static int largest(int bada[]) {
        int bigger = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i = 0; i<bada.length; i++){
            if(bigger < bada[i]){
                bigger = bada[i];
            }
            if(small >bada[i]){
                small = bada[i];
            }
        }System.out.println("Smallest value:- " + small);
         return bigger;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size to be stored: -");
        int input = sc.nextInt();
        int bada[] = new int[input];
        System.out.println("Enter a value according to your given size: -");
        for(int i = 0; i< bada.length; i++){
            bada[i] = sc.nextInt();
        }
        System.out.println("Largest value among given number:- " + largest(bada));
        sc.close();
    }
}