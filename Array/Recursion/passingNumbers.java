import java.util.*;
public class passingNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        System.out.println(pass(in));
        sc.close();
    }
    public static int pass(int in){
        if(in==1){
            return 1;
        }
        System.out.println(in);
        return pass(--in);
    }
}