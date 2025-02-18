import java.util.*;
class factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int factorialNumber = sc.nextInt();
        factor2(factorialNumber);
        sc.close();
    }
    // brute force approch O(n)
    // public static void factor(int factorialNumber){
    //     for(int i = 1; i<= factorialNumber; i++){
    //         if(factorialNumber % i == 0){
    //             System.out.print((i + " "));
    //         }
    //     }
    // }


    // optimied approch O(sqrt(n)) - for time complexity
    // public static void factor(int factorialNumber){
    //     for(int i = 1; i<= Math.sqrt(factorialNumber); i++){
    //         if(factorialNumber % i == 0){
    //             if(factorialNumber/i == i)
    //                 System.out.println(i);
    //             else
    //                 System.out.print((i + " " + factorialNumber/i + " "));
    //         }
    //     }
    // }
    // time and space complexity better(Sqrt(n))
    public static void factor2(int factorialNumber){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<= Math.sqrt(factorialNumber); i++){
        if(factorialNumber % i == 0){
            if(factorialNumber/i == i)
                System.out.print(i);
             else{
                 System.out.print(i + " " );
                 list.add(factorialNumber/i);
            }
        }
        }
        for(int i = list.size() -1; i>= 0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}