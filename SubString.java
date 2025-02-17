import java.util.*;
public class SubString {
    // public static String sub(String ok, int start, int end){
    //     String index = "";
    //     for(int i = start; i<end; i++){
    //         index += ok.charAt(i);
    //     }
    //     return index;
    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String in = sc.nextLine();
        System.out.println("Enter starting index of string from 0 to n:- ");
        int start = sc.nextInt();
        System.out.println("Enter ending index of a string:- ");
        int end = sc.nextInt();
        // System.out.println(sub(in , start, end));
        System.out.println(in.substring(start,end));
        sc.close();
    }
}
