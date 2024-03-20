package practice_que_2;

public class Name {

	public static void main(String[] args) {
		
		String s1 = "anagha";
		int collect =0;
		
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i)=='a') {
				collect++; 
			}
		}
		System.out.println("the occurance of a is -->"+ collect);
		
//		char ch = 'e';
//		System.out.println(ch == 'e');
		

	}

}
