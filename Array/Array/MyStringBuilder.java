import java.util.*;
public class MyStringBuilder{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String in = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char i = 'a'; i<='z'; i++){
            sb.append(i);
        }
        System.out.println(sb); 
        sc.close(); 
    }
}                                           