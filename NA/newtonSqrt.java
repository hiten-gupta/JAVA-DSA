import java.util.*;
public class newtonSqrt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        sc.close();
        System.out.println("Square root of " + n + " is: " + sqrt(n));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
           root = 0.5 * (x + (n/x));
           if (Math.abs(root-x) < 0.5)
                 break;
            x = root;
    }
        return root;
    }
}
