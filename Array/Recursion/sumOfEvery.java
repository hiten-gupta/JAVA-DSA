import java.util.*;
public class sumOfEvery{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n == 0){ //add n%10 == n and return n  in case of multilication to avoid getting 0 in output terminal 
            return 0;
        }
        return (n%10) + sum(n/10);
    }
}