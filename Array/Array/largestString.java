import java.util.*;
public class largestString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of your string:- ");
        int in = sc.nextInt();
        String enter[] = new String[in];
        System.out.println("Enter name to compare:- ");
        for(int i =0; i<enter.length; i++){
            enter[i] = sc.next();
        }
         String compare = enter[0]; // initialize first enter name as largest
         for(int i = 1; i<enter.length; i++){
            if(compare.compareTo(enter[i]) <0){
                compare = enter[i];
            }
         }
         System.out.println(compare);
         sc.close();
    }
}
