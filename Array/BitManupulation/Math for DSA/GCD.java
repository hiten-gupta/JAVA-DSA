import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b) + " GCD of a number");
        System.out.println(lcm(a, b)+ " LCM of a number");
        sc.close();
    }
     static int gcd(int a, int b){
        if(a == 0)
             return b;
        return gcd(b%a,a);
    }
    static int lcm(int a, int b){
        return a*b / gcd(a, b);
    }
}
