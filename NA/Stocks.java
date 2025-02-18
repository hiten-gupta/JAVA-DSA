import java.util.*;
public class Stocks {
    public static int stocks(int[] price){
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<price.length; i++){
            if(buy< price[i]){
                int profit = price[i] - buy;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buy = price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:-");
        int in = sc.nextInt();
        int price[] = new int[in];
        System.out.println("Enter elements in array:- ");
        for(int i = 0; i<price.length; i++){
            price[i] = sc.nextInt();
        }
        System.out.println("Maximum profit earned:- " + stocks(price));
        sc.close();
    }
}
