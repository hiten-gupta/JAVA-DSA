import java.util.*;
public class powerOfTwo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        System.out.println(callOf(in));
        sc.close();
    }
    public static boolean callOf(int in) {
        return in > 0 && (in & (in - 1)) == 0;
    }
}