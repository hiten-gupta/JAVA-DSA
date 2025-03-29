import java.util.*;
public class countZero{
    public static int zero(int n){
        return help(n,0);
    }
    private static int help(int n, int count){
        if(n == 0) return count;
        int rem = n % 10;
        if(rem == 0) return help(n/10, count +1);
        return help(n/10, count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(zero(n));
    }
}