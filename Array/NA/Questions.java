import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();//declaring variable x to be user oriented 
        //boolean ans = isPrime(x);//pass boolean to check if entered expression is true or not
        System.out.println(isPrime(x));// print variable ans 
        sc.close();
    }
    static boolean isPrime(int x){//make a static class name isPrime
        if(x <= 1){// if a number is smaller or equal to 1 return false
            return false;
        }
        int c= 2;//give a decalration to variable that c have a constant value of 2
        while (c * c <= x){ //agar 2*2 is smaller or equal than x 
            if(x % c ==0){ // find modulo of x variable by dividing 2
                return false;
            }
            c++;
        }
        return c * c >x;//if the reminder is 1 than its a prime number 
    }
}
