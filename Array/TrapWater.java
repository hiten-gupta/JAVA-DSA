import java.util.*;
public class TrapWater {
    public static int water(int store[]){
        //to calculate left max boundary - with the help of auxalarry array
        int left[] = new int[store.length];
        
        left[0] = store[0];
        for(int i =1; i<store.length; i++){
            left[i] = Math.max(store[i], left[i-1]);
        }
        //to calculate right max boundary - with auxallri array
        int right[] = new int[store.length];
        right[store.length-1] = store[store.length-1];
        for(int i = store.length-2;i>=0;i--){
            right[i] = Math.max(store[i],right[i+1]);
        }
        int trapedWater = 0;
        // loop
        for(int i =0 ; i<store.length; i++){
            // waterlevel = min(leftmax, rigthmax)

            int waterLevel = Math.min(left[i],right[i]);
            //trapped water = waterLevel - heigth[i]

            trapedWater += waterLevel - store[i];
        }
        return trapedWater;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int in = sc.nextInt();
        int[] store = new int[in];
        System.out.println("Enter element of array:- ");
        for(int i =0; i<store.length; i++){
            store[i] = sc.nextInt();
        }
        System.out.println("traped water total volume:- " + water(store));
        sc.close();
    }
}
