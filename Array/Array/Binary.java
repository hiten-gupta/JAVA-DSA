import java.util.*;
public class Binary{
    public static int search(int binary [], int value ){
        int start  = 0, end = binary.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(binary[mid] == value){
                return mid;
            }
            if(binary[mid] < value){
                start=mid+1;
            }
            if(binary[mid] > value){
                end=mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:- ");
        int in = sc.nextInt();
        int binary[] = new int[in];
        System.out.println("Enter numbers:- ");
        for(int i = 0; i< binary.length;i++){
            binary[i] = sc.nextInt();
        }
        Arrays.sort(binary);
        System.out.println("Sorted array:- " + Arrays.toString(binary));
        System.out.println("Enter value to find:- ");
        int value = sc.nextInt();
        
        System.out.println("Value you are looking for find on index:- " + search(binary, value));
        sc.close();
    }
}