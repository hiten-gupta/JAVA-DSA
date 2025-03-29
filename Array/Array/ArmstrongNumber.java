import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Armstrong Number");
        int number = sc.nextInt();
       // System.out.println(isArmStrong(number));
       for(int i = 0; i< number; i++){
        if(isArmStrong(i)){
            System.out.print(i + " ");
        }
       }
        sc.close();
        }
        static boolean isArmStrong(int n){
            int define = n;
            int add = 0;
            while (n> 0){
                int reminder =  n %10;
                n = n/10;
                add = add + (int) Math.pow(reminder, String.valueOf(define).length());
            }
            //System.out.println("Entered number is an Armstrong  number");
            return add == define;
        }
    }
