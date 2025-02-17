package NA;
import java.util.*;
public class magicNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans += last * base;
            base = base* 5;
        }
        System.out.println(ans);
        sc.close();
    }
    
}
