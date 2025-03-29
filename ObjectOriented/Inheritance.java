package ObjectOriented;
import java.util.*;

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fish orc = new Fish();
        orc.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Sanslerha");
    }
    void color(){
        System.out.println("Skin color");
    }
    void breed(){
        System.out.println("Kon si jaati ka hai");

    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Tair rhi hai");
    }

}
