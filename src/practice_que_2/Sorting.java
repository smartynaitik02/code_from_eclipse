package practice_que_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {

//  7.Write a Java program to sort a numeric array and a string array.  
//	Int arr[] = {1,2,4,5,6,7}

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,7,6,5};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i: arr) {
			al.add(i);
		}
		
		System.out.println(al);
		
//		Collections.sort(al);
//		
//		System.out.println(al);
		
		Arrays.sort(arr);
		
//		System.out.println(Arrays.toString(arr));
		
		String result = Arrays.toString(arr);
		System.out.println(result.charAt(4));
		
		
//		System.out.println(arr[1]);
		
		if(result.charAt(4)==2) { //2==2
			System.out.println("number is equal");
		}
		else {
			System.out.println("number are not equal");
		}
		
		
		
		
		

	}

}
