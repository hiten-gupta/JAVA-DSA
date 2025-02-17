// import java.io.*;
package Sorting;
import java.util.*;
public class SearchInString {
    public static int search(String store[] , String key){
        for(int i = 0; i< store.length; i++){
            if(store[i].equals(key)){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int in = sc.nextInt();
        String[] store = new String[in];
        System.out.println("Enter numbers in an array:- ");
        for(int i =0; i<store.length; i++){
            store[i] = sc.next();
        } 
        String key = sc.next();
        int index = search(store, key);
        if(index == -1){
            System.out.println("Entered value not found");
        }else{
            System.out.println("Entered name found on index:- " + index);
        }
        sc.close();
    }
}
