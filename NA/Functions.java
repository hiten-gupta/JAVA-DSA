package NA;
import java.util.Scanner;

// public class Functions {
//     public static void main(String[] args) {
//         // Q take input of 2 numbers and print the sum
//         int ans = sum2();
//         System.out.println(ans);
//     }
//     // integer type to return the value of void method 
//     static int sum2 (){//we can call this a fuctoin which will be define outside of psvm string 
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a sum 1 value:-");
//         int a = sc.nextInt();
//         System.out.print("Enter a sum 2 value:-");
//         int b = sc.nextInt();
//         System.out.print("Sum of two values are:-");
//         int sum = a + b;//return sum would be int sum = a + b not void method
//         sc.close();
//         return sum; //After the return the no value written outside this will execute
//     }
// //     //static void method doesn't return any type and call the fuction
// //     static void method(){
// //          Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a sum value:-");
// //         int a = sc.nextInt();
// //         int b = sc.nextInt();
// //         System.out.println("Sum of two values are:-");
// //         int sum = a + b;
// //         System.out.println(sum);
// //         sc.close();
// //     } 
//  }
  
   public class Functions{
     public static void main(String args[] ){
        // String greet = namste();
        // System.out.println(greet);

        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your name:-> ");
        String name = in.nextLine();
        String Irtika = yourGreet(name);
        System.out.println(Irtika);
        in.close();
   }

   static String yourGreet(String name) {
    String message = "Welcome " + name;
    return message;

   }
    static String namste() {
        String welcome = "Welcome to our place";
        return welcome;
    }
   } 