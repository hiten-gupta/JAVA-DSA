import java.util.*;
public class palindromeCheckOfString{
    public static boolean isPalindrome(String s){
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return checkPalindrome(s,0);
    }
    private static boolean checkPalindrome(String s, int index){
        if(index >= s.length()/2) return true;
        if(s.charAt(index) != s.charAt(s.length()-1-index))return false;
        return checkPalindrome(s,index+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}