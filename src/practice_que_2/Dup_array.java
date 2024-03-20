package practice_que_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class Dup_array {

//	Write a Java program to find common elements between two arrays (string values).  String arr[] = {“Test”,”HI”,”Java”,”Python”};  
//	String arr2[] = {"Hello","Java","Python", "Demo"};

	public static void main(String[] args) {
		//1,2,43,5,66,73,43,5,1
//		PriorityQueue po = new PriorityQueue();
//		
//		LinkedHashSet lhs = new LinkedHashSet();
		
		Integer arr[] = {1,2,43,5,66,73,43,5,1};
		String arr1[] = {"Java","HI","Python","Java","HI","Python","Ruby"};  
		
		Object arr3[] = {"Java","HI","Python","Java","HI","Python","Ruby",1,2,43,5,66,73,43,5,1};
		
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<String> hs1 = new HashSet<String>();
		HashSet<Object> ob1 = new HashSet<Object>();
		
		for(Integer i: arr) {
		hs.add(i);
		}
		
		System.out.println(hs);
		
		for(String str: arr1) {
			hs1.add(str);
		}
		
		System.out.println(hs1);
		
		for(Object obj: arr3) {
		ob1.add(obj);
	}
		
		System.out.println(ob1);
		
		
		
		
		
		
		
		
//		lhs.add(1);
//		lhs.add(2);
//		lhs.add(43);
//		lhs.add(5);
//		lhs.add(66);
//		lhs.add(73);
//		lhs.add(43);
//		lhs.add(5);
//		lhs.add(1);
//		
//		
//		
//		
//		System.out.println(lhs);
//		
//		lhs.remove(lhs);
//		
//		System.out.println(lhs);
		

	}

}
