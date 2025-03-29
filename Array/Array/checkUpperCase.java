import java.util.*;
public class checkUpperCase{
    public static String toUpper(String str){
        if(str.length() <3){
            return str.toLowerCase();
        }
        StringBuilder gh = new StringBuilder();
        char a = Character.toUpperCase(str.charAt(0));
        gh.append(a);
        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length() -1){
                gh.append(str.charAt(i));
                i++;
                gh.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                gh.append(Character.toLowerCase(str.charAt(i)));
            }
        }  
        return gh.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:- ");
        String in = sc.nextLine();
        System.out.println(toUpper(in));
        sc.close();
    }
}