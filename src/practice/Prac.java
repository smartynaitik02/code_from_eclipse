package practice;

import java.util.Arrays;

public class Prac {

	

	public static void main(String args[]) {
		int arr[] = { 1, 5, 6, 0, 9, 8, 0, 5 };

		int len = arr.length;
		int index_num = 0;
		int new_arr[] = new int[len];

		for (int i = 0; i < len; i++) {

			if (arr[i] != 0) {
				new_arr[index_num] = arr[i];
				index_num++;
			}
		}

		String final_arr = Arrays.toString(new_arr);
		
		System.out.println(final_arr);
		
		
		String rev = "";
		int len_final = final_arr.length();
		
		for(int j=len_final-2; j>0 ;j--) {
			
			System.out.print(final_arr.charAt(j));
		}
		
		

	}
}


