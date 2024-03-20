package practice_que_2;

import java.util.HashSet;

public class Dup_output {
//	2. Write a Java program to find duplicate values in an array.  
//	 Int arr[] = {1,2,4,5,6,3,66,33,22,1,4}; 
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,6,3,66,33,22,1,4,1};
		
		HashSet<Integer> i3 = new HashSet<Integer>();
		
//		i3.add(100);
//		i3.add(200);
//		 //false
//		
//		System.out.println(i3.add(300));
		
//		System.out.println(i3);
		
		
		
		for(Integer i: arr) {
			
			if(i3.add(i)==false) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
