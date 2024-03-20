package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac8_ {

	public static void main(String[] args) {
		
		//String arr []= new String[3];
		
//		String arr []= {"Anagha", "Shweta", "Shravan"};
//		
//		List<String> new_arr = Arrays.asList(arr);
//		
//		//System.out.println(Arrays.toString(arr));
//		
//		for(String word: new_arr) {
//			
//			System.out.println(word);
//		}
//		
		Integer arr []= {100,200,300};
		
		ArrayList<Integer> new_arr = new ArrayList(Arrays.asList(arr));
		
		//System.out.println(Arrays.toString(arr));
		
		for(Integer word: new_arr) {
			
			System.out.println(word);
		}
		
		
		
		
		

	}

}
