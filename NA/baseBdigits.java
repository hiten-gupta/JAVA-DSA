package NA;
import java.util.*;
public class baseBdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int b = sc.nextInt();
        int ans = (int)(Math.log(nums) / Math.log(b)) +1;
        System.out.println(ans);
        sc.close();
    }
}
