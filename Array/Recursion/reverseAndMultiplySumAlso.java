import java.util.*;
class reverseAndMultiplySumAlso{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rev(n);
        System.out.println(mul(n));
        System.out.println(sum(n));
    }
    public static void rev(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        rev(n-1);
        System.out.println(n);
    }
    public static int mul(int n){
        if(n == 1){
            return 1;
        }
        return n*mul(n-1);
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n+sum(n-1);
    }
}