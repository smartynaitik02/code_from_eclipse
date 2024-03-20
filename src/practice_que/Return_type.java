package practice_que;

import java.util.ArrayList;

public class Return_type {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add("payal");
		al.add("shravan");
		al.add(100);
		
		System.out.println(al);
		
		boolean res = al.contains("payal");
		System.out.println(res);
		
		Object str = al.get(1);
		System.out.println(str);
		
		
		
		
		

	}

}
