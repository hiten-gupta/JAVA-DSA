package NA;
import java.util.*;
// import java.lang.*;
public class get {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        System.out.println(callBit(n,u));
        sc.close();
    }
        public static int callBit(int n, int u){
        int bitMask = 1<<u;
        if((n & bitMask) ==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    }

