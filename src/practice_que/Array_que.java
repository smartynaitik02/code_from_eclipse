package practice_que;

import java.util.LinkedList;

public class Array_que {
	
//	Write a Java program to find common elements between 
//	two arrays (string values).  String arr[] = {“Test”,”HI”,”Java”,”Python”};  
//	String arr2[] = {"Hello","Java","Python", "Demo"};

	public static void main(String[] args) {
		
		
		LinkedList ll = new LinkedList();
		
		ll.add(100);
		ll.add("shravan");
		
		System.out.println(ll.get(1));
		
		String arr1[] = {"TEST", "HI", "JAVA", "PYTHON"};
		
		String arr2[] = {"HELLO", "JAVA","PYTHON","DEMO"};
		
		String val;
			for(String value:arr1) {
				//System.out.println(value);
				 val = value;
				 for(int i=0;i<arr2.length;i++) {
					 
					 if(val.equals(arr2[i])) {
						 System.out.println("string content is same for -->"+ val );
					 }
					 else {
						 System.out.print("");
					 }
					 
				 }
				 System.out.println("");
			}
		
		

	}

}
