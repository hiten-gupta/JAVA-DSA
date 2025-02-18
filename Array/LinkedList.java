import java.util.*;
public class LinkedList{
    public static int search(String link[], String found){
        for(int i = 0; i<link.length; i++){
            if(link[i].equals(found)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int n = sc.nextInt();
        String link[] = new String[n];
        System.out.println("Enter elements in array: - ");
        for(int i = 0; i<link.length; i++){
            link[i] = sc.next();
        }
        System.out.println("Enter element to find in array:- ");
        String found = sc.next();
        int index = search(link, found);
        if(index == -1){
            System.out.println("The number you are looking for not found");
        }
        else{
            System.out.println("Number found at index:- " + index);
        }
        sc.close();
    }
}