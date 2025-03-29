import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int prime = sc.nextInt();
        for(int i= 1; i<=prime; i++){
            if(isPrime(i))
            System.out.println(i + " " + isPrime(i));
        }
        sc.close();
    }
    static boolean isPrime(int prime){
        if(prime <= 1)
         return false;

        int c = 2;
        while(c*c <= prime){
            if(prime%c == 0)
             return false;
        c++;
        }
        return true;
    }
}
