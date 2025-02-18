package NA;
import java.util.Scanner;

public class Dopamine {
    public static void main(String[] args) {
        Scanner neuro = new Scanner(System.in);
        
        System.out.println("Enter your first number->- ");
        float num1 = neuro.nextFloat();
        System.out.println("Enter your second number->- ");
        float num2 = neuro.nextFloat();

        float sum = num1 + num2;

        System.out.println("Addition of given two numbers are = " + sum);
        neuro.close();
    }
    
}
