import java.util.*;
import java.util.ArrayList;
public class Multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        /// initialization part how would this loop will work and we have 3 arraylist in this
        for(int i = 0; i< n; i++){
            list.add(new ArrayList<>());
        }//add element
        for(int i = 0;i<n; i++ ){
            for(int j= 0; j <n; j++){
                list.get(i).add(sc.nextInt());
                //System.out.println();
            }
        }
        System.out.println(list);
    sc.close();}
}
