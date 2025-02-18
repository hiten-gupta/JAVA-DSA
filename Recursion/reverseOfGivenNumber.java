// import java.util.*;
// public class reverseOfGivenNumber{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         reverse(n);
//         System.out.println(temp);
//     }
//     static int temp = 0;
//     public static void reverse(int n){
//         if(n == 0)
//            return;
//     int rev = n % 10;
//     temp = temp*10 + rev;
//     reverse(n/10);
//     }
    
// }
// using actual recursion 
import java.util.*;
public class reverseOfGivenNumber{
    public static int rev(int n ){
        int digit = (int) (Math.log10(n)) + 1;
        return help(n,digit);
    }
    private static int help(int n, int digit){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return (int) (rem *Math.pow(10,digit -1) + help(n/10, digit-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rev(n));
    }
}