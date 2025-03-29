import java.util.*;
import java.util.ArrayList;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt(); 
        ArrayList<Integer> list = new ArrayList<>(2 );
        // list.add(67);
        // list.add(79);
        // list.add(6);
        // list.add(68);
        // list.add(241);
        // list.add(46543);
        // //System.out.println(list.contains(454468));
        // System.out.println("Number Before removal:- ");
        // System.out.println(list);
        // list.set(0, 99999999);
        // System.out.println("Number after updation and removal :- ");
        // list.remove(3);
        // System.out.println(list);
        for (int number = 0; number < a; number++){
            list.add(sc.nextInt());
        }
        for (int number = 0; number < a; number++){
            System.out.println(list.get(number));
        }
        System.out.println(list);
        sc.close();
    }
}
