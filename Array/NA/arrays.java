package NA;
import java.util.*;
// import java.lang.*;
// import java.io.*;

class arrays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[] arr = new int[in];
		for(int i = 0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		int nums = sc.nextInt();
		for(int h = 0; h<arr.length; h++) {
		 if(arr[h] == nums){
		     System.out.println("YES");
		 }   
		 else{
			System.out.println("NO");
		 }
		 
		}
		sc.close();
	}
}
