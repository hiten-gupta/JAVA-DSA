import java.util.*;
public class square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] prime = new boolean[n+1];
         primes(n, prime);
         sc.close();
    }
    public static void primes(int n, boolean[] prime){
        for(int i = 2; i*i <= n; i++){
            if(!prime[i])
              for(int j = i*2; j<=n; j+=i)
                prime[j] = true;
        }
        for(int i = 2; i<=n;i++)
         if(!prime[i])
             System.out.print(i+ " ");
    }
    
}