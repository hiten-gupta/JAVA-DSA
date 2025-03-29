import java.util.*;
public class Stings {
    public static boolean str(String name){
     for(int i=0;i<name.length()/2;i++){
       if(name.charAt(i) != name.charAt(name.length()-1-i)){
        return false;
       }
     }
     return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name to check:");
        String name = sc.nextLine();
        System.out.println("Your entered string is:");
        System.out.println(str(name));
        sc.close();
    }
}
