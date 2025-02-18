import java.util.*;
public class Capgemeni {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int a = sc.nextInt();
        int t = sc.nextInt();
        int intial = v - (a*t);
        System.out.println(intial);
        sc.close();
    }
}
