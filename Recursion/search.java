import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i = 0; i< input; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(linear(arr,target, 0));
        System.out.println(searchLinear(arr, target, 0));
        findAll(arr, target, 0);
        System.out.println(list);
        sc.close();
    }
    static boolean linear(int[] nums, int target ,int index  ){
        if(index == nums.length) return false;
        return nums[index] == target || linear(nums, target,index+1);
    }
    static int searchLinear(int nums[], int target, int index){
        if(index == nums.length) return -1;
        if(nums[index] == target) return index;
        else return searchLinear(nums, target, index+1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll(int[] nums, int target, int index){
        if(index == nums.length-1) return;
        if(nums[index] == target) list.add(index);
        findAll(nums, target, index+1);
    }
}
