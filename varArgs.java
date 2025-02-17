import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        //fin("Hiten","Name", "Shani");
        //fun(1,2,3,4);
        multiple(1,2,"Hiten","Name");
    }
    static void multiple(int a, int b, String...c){
        System.out.println("a:" + a + ",b:" + b);
        System.out.println("c: "+ Arrays.toString(c));
    }


    //static void fin(String ...b)
    // static void fun(int ...b){
      //  System.out.println(Arrays.toString(b));
    }

