import java.util.*;
public class Shortest {
    public static float path(String in){
        int x =0,y=0;
        for(int i=0;i<in.length();i++){
            char d= in.charAt(i);
            //south
            if(d == 'S'){
                y--;
            }
            else if(d == 'N'){
                y++;
            }
            else if(d == 'W'){
                x--;
            }
            else if(d == 'E'){
                x++;
            }
        }
        int X = x*x;
            int Y = y*y;
        return (float)Math.sqrt(X + Y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String in capital letters:- ");
        String in = sc.next();
        System.out.println(path(in));
        sc.close();
    } 
}
 