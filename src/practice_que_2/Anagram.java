package practice_que_2;

import java.util.Arrays;

public class Anagram {
	//if two words contain same char and length
	public static void main(String[] args) {
		
		String s1 = "race";
		String s2 = "cagre";
		
		if(s1.length()==s2.length()) {
			
			//convert string to char array
			char ch[] = s1.toCharArray();
			char ch1[] = s2.toCharArray();
			
			//now sort the array
			Arrays.sort(ch);
			Arrays.sort(ch1);
			
			//now compare
			
			boolean bool =Arrays.equals(ch, ch1);
			System.out.println(bool);
			
		}
		

	}

}
