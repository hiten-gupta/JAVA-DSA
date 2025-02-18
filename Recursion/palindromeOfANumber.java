import java.util.*;
public class palindromeOfANumber{
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
    static boolean palindrome(int n){
        return n == rev(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rev(n));
        System.out.println(palindrome(n));
    }
}