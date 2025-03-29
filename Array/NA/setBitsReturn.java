import java.util.*;
public class setBitsReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(counter(n));
        sc.close();
    }
    public static int counter(int n){
        int count = 0;
        while(n>0){
            // if((n&1) == 1){
            //     count++;
            // }
            // n = n>>1;
            // count ++;
            // n -= (n& -n);
            count ++;
            n = n & (n-1);
        }
        return count;
    }
}
