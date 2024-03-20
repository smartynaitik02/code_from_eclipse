package practice_3;

import java.util.Arrays;

public class Logical5 {

	public static void main(String[] args) {
		
		
		int arr[] = {1,5,6,0,9,8,0,5};
		
		int len = arr.length; //8
		
		int index_num = 0;
		
		int new_arr [] = new int[len];
		
		for(int element : arr) {
			
			if(element!=0) { // 1 is not equal to 0 , 
			new_arr[index_num] = element; //new_arr[0] = 1; new_arr[1] =5
			index_num++; //1//2
			
			//[1,5,6,9,8,5,0,0,0]
		}
		
		
		
	}
		
//		String str = Arrays.toString(new_arr);
//		System.out.println(str);
		
		int rev [] = new int[len];
		
		for(int i = len-1; i>=0;i--) {
			
			rev[i]= new_arr[i];
			
			
			
		}

		System.out.println(Arrays.toString(rev));
		
		
		
		
	}	

}
