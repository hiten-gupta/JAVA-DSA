import java.util.*;
public class xorNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0; i<=a; i++){
            int result = number(i);
            System.out.println("Number: " + i + "-> Decimal result: " + result + " Binary representation of numbers: " + Integer.toBinaryString(i));
        }
        System.out.println(number(a));
        sc.close();
    }
    public static int number(int a) {
            if(a % 4== 0){
                return a;
            }else if(a % 4 == 1){
              return 1;
            }else if(a%4 == 2){
                return a+1;
            }else if (a%4 == 3){
                return 0;
            }
            int r1 = (int)Math.random();
            return r1;
        }
        
    }