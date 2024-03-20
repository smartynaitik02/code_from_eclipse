package practice_que;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_arraylist {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("shravan");
		al.add("angha");
		al.add("shweta");
		al.add(100);
		al.add(500);
		
		System.out.println(al);
		al.add(3, 700);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);

	}

}
