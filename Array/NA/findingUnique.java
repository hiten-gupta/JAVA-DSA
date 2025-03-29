package NA;
import java.util.*;
public class findingUnique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int[] arr = new int[in];
        for(int i = 0; i< in; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int unique = findUnique(arr);
        System.out.println(("outcome of unique number in array:- "+unique));
        System.out.println("Number in binary form:- " + Integer.toBinaryString(unique));
    }

    public static int findUnique(int[] arr){
        int[] bitcount = new int[32];
        for(int num :arr ){
            for(int i = 0; i<32;i++){
                if((num & (1<<i)) != 0){
                    bitcount[i] += 1;
                }
            }
        }
        // System.out.println("Bit counts: ");
        // for (int i = 0; i < 32; i++) {
        //     System.out.println("Bit " + i + ": " + bitcount[i]);
        // }
        int result = 0;
        for(int i =0; i< 32;i++){
            if(bitcount[i] % 3 != 0){
                result |= (1 << i);
            }
        }
        return result;
    }
    
}
// import java.util.*;

// public class findingUnique {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int in = sc.nextInt();
//         int[] arr = new int[in];
//         for (int i = 0; i < in; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();

//         System.out.println("Input array: " + Arrays.toString(arr));  // Print input array for verification

//         int unique = findUnique(arr);
//         System.out.println("Outcome of unique number in array: " + unique);
//         System.out.println("Number in binary form: " + Integer.toBinaryString(unique));
//     }

//     public static int findUnique(int[] arr) {
//         int[] bitcount = new int[32];  // Array to store bit counts for 32 bits

//         // Count how many times each bit appears across all numbers
//         for (int num : arr) {
//             System.out.println("Processing number: " + num);  // Print each number being processed
//             for (int i = 0; i < 32; i++) {
//                 if ((num & (1 << i)) != 0) {
//                     bitcount[i]++;
//                 }
//             }
//         }

//         // Print bit counts for debugging
//         System.out.println("Bit counts: " + Arrays.toString(bitcount));

//         // Reconstruct the result from bits that don't appear in multiples of 3
//         int result = 0;
//         for (int i = 0; i < 32; i++) {
//             if (bitcount[i] % 3 != 0) {
//                 result |= (1 << i);  // Set the bit in the result if bitcount[i] is not a multiple of 3
//                 System.out.println("Setting bit " + i + " in the result, result now: " + result);
//             }
//         }

//         return result;
//     }
// }

