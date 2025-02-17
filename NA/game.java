package NA;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
       Scanner pubg = new Scanner(System.in);
       pubg.close();

    //    System.out.println("Enter your first name->- ");
    //    String name1 = pubg.nextLine();

    //    System.out.println("Enter the last name->- ");
    //    String name2 = pubg.nextLine();

    //    String full = name1 + name2;
    //    System.out.println("Your full name is->- "+ full);
          
    // float num = (float)(6325.35f);
    // System.out.println(num);
    // //automatic type promotion in expressions
    // int a = 1024;
    // byte b = (byte)(a);
    // System.out.println(b);
       
        // int  number = 'a';
        //  System.out.println(number);
         
        //   System.out.println(3*3655.32);

        byte b = 86;
        char c = 's';
        short s = 4256;
        int i = 532355;
        float f= 4554.464f;
        double d= 0.32215;
        double result = (f * b) + (i/c) - (d-s);
        System.out.println((f * b) + " " +(i/c)+" " + (d-s));
        System.out.println(result);

    }
    
}
