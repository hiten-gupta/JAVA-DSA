import java.util.*; 
public class sorted {
    public static boolean search(int ap[][], int key){
        int row =0,coln=ap[0].length-1;
        while (row<ap.length && coln>= 0) {
            if(ap[row][coln] == key){
                System.out.println("Entered key found at index (" + row +","+ coln +")");
                return true;
            }
            else if(key<ap[row][coln]){
                coln--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:-");
        int in = sc.nextInt();
        int col = sc.nextInt();
        int[][] ap = new int[in][col];
        System.out.println("Enter values of array:-");
        for(int i=0;i<ap.length;i++){
            for(int j=0;j<ap.length;j++){
                ap[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter number to be found:- ");
        int key = sc.nextInt();
        search(ap, key);
    sc.close();
}
}
