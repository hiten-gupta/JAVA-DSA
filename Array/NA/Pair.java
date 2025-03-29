import java.util.*;
public class Pair {
    public static void loop(int element[]){
        int tp = 0;
     for(int i =0;i<element.length; i++){
        int present = element[i];
        for(int j = i+1; j<element.length; j++){
            System.out.print("(" + present + "," + element[j] + ")");
            tp ++;
        }
        System.out.println();
     }System.out.println("Total number of pairs:- " + tp  );
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:- ");
        int in = sc.nextInt();
        int element[] = new int[in];
        System.out.println("Enter the values");
        for(int i =0; i<element.length; i++){
            element[i] = sc.nextInt();
        }
        System.out.println("Pair of give arrays:- ");
        loop(element);
        sc.close();
    }
}
