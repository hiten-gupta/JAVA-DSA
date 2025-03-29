import java.util.*;
public class pascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        List<Integer> r = triangle(in);
        System.out.println(in+ ":" + r);
        sc.close();
    }
    public static List<Integer> triangle(int in){
        List<Integer>  row = new ArrayList<>();
        long prev = 1;
        row.add((int)prev);
        for(int i = 1;i <= in;i++){
            prev = (prev *(in-i+1)) / i;
            row.add((int) prev);
        }
        return row;
    }
}
