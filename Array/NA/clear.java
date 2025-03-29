package NA;
import java.util.*;
public class clear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(clearBit(n,u));
        sc.close();
    }
    public static int clearBit(int n, int u){
        int bit = ~(1<<u);
        return n & bit;
    }
}