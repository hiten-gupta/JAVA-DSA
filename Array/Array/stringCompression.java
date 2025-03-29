import java.util.*;
class stringCompression{
    public static String compress(String comp){
        StringBuilder in = new StringBuilder();
        for(int i =0; i<comp.length();i++){
            Integer count = 1;
            while(i<comp.length()-1 && comp.charAt(i) == comp.charAt(i+1)){
                count++;
                i++;
            }
            in.append(comp.charAt(i));
            if(count>1){
                in.append(count);
            }
        }
        return in.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String:-");
        String in = sc.nextLine();
        System.out.println(compress(in));
        sc.close();
    }
}