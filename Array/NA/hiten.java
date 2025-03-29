package NA;
import java.util.Scanner;

public class hiten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//to take input from your keyboard//
//here sc means an inpput variable it could be anythging of your choice 
    System.out.println("Enter your rollnumber->- ");
    int rollno = sc.nextInt();//Enter the integer of your choice

    System.out.println("Enter a float value->- ");
    float number = sc.nextFloat();//float value with decimal number or a fraction 

    System.out.println("Enter a letter->- ");
    char letter = sc.next().charAt(0);//Store a name staring with index zero like "Hiten" here it will start from h rather than i

    System.out.println("Enter Large Number or integer->- ");
    long large = sc.nextLong();//a really long number let us say your mobile number or any random digtis

    System.out.println("Enter Decimalvalue->- ");
    double digitvlaue = sc.nextDouble();//same as float but with larger decimal values

    sc.nextLine();

    System.out.println("Enter your Name->- ");
    String name = sc.nextLine();//add a name or something 

    System.out.println("Enter check true/false->- ");
    boolean check = sc.nextBoolean();// only to state a value is true or not if we say 0>1  than this satement is true 0<1 it is false

    sc.close();

    System.out.println("Roll No-> " + rollno);
    System.out.println("Number-> " + number);
    System.out.println("Letter-> " + letter);
    System.out.println("Large Integer-> " + large);
    System.out.println("Large Decimal Value-> " + digitvlaue);
    System.out.println("Name-> " + name);
    System.out.println("Check-> " + check);
    
    }

}