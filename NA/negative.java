import java.util.*;
public class negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        int sum = ~(n) + 1;
        System.out.println(Integer.toBinaryString(sum));
        System.out.println(sum);
        sc.close();
    }
}
