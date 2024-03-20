package practice_3;

import java.util.Arrays;

public class Ana {

	public static void main(String[] args) {
		
		//Anagram word
	       
	       String s1 = "race";
	       String s2 = "care";
	       
	       int len1 = s1.length();
	       int len2 = s2.length();
	       
	       if(len1==len2){
	           
	           char ch1 [] =s1.toCharArray();
	           char ch2 [] = s2.toCharArray();
	           
	           Arrays.sort(ch1);
	           Arrays.sort(ch2);
	           
	           boolean bool =Arrays.equals(ch1,ch2);
	           
	           System.out.println(bool);
	           
	       }
	}

}
