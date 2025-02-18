package NA;
import java.util.Scanner;

public class Dopelganger {
    // public static void main(String[] args) {
    //     // int a = 10;

    //     // if(a == 10) {
    //     //     System.out.println("Hello World");
    //     // }

    //     // int count = 1;
    //     // while(count != 5 ){
    //     //     System.out.println(count);
    //     //     count++;

    //         //for loop
    //         for(int count = 1; count != 5; count++) {
    //             System.out.println(count);
    //         }
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter temperature in celcius -> -  ");
        float tempC = sc.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
        sc.close();
    }
}

