import java.util.*;
public class vowelToConsonent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tst = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< tst; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
        if(checkPoss(s1,s2) == true)
            System.out.println("Yes");
        else 
            System.out.println("No");
        }
        
        sc.close();
    }
    public static boolean isVowel(char c){
        if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
               return true;
        else
             return false;       
    }
    public static boolean checkPoss(String s1,String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 != l2)
              return false;
        for(int i = 0; i< l1;i++){
            if(isVowel(s1.charAt(i)) && isVowel(s2.charAt(i))){
                continue;
            }
            else if(!(isVowel(s1.charAt(i))) && !(isVowel(s2.charAt(i)))){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}