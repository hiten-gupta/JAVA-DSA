public class Showding {
     static int a =1000;//cannot use object dependent thing in independent. That's why we use static in this.
    public static void main(String[] args) {//this pvsm is indepenet and int a is depented
        System.out.println(a);
        int a = 90;
        System.out.println(a);
        fun();
    }
    static void fun(){
        System.out.println(a);
    }
}
