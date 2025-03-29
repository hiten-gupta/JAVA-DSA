// import java.util.Scanner;
public class Overloading {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); 
    // look(10679);
    // look("Hiten Gupta");    
       int look = sum(23, 45 );
       System.out.println(look);
    }
    static int  sum(int a , int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a * b * c; 
    } 
    static double  sum (double a, double b){
        return a+b;
    }
    // static void look(int v){//can have same name but different arguments is overloading 
    //     System.out.println(v);
    // }
    // static void look(String namer){
    //     System.out.println(namer);
    // }
}
