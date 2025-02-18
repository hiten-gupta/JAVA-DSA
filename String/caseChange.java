import java.util.*;
public class caseChange{
    public static StringBuilder toogle(StringBuilder str){
        for(int i = 0; i< str.length(); i++){
            boolean flag = true;
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ch == ' ') continue;
            if(ascii >= 97) flag = false;
            if(flag == true){
                ascii += 32;
                char value = (char)ascii;
                str.setCharAt(i,value);
            }
            else{
                 ascii -= 32;
                 char value = (char)ascii;
                 str.setCharAt(i,value);
            }
        }
        return str;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        StringBuilder str = new StringBuilder(in);
        System.out.println(toogle(str));
        sc.close();
    }
}