package practice;

public class Prac4 {

	public static void main(String[] args) {
		String str = "Shravan vinita";
		int len = str.length();
		int collect_a = 0;
		int collect_v = 0;
		
		for(int i =0;i<len;i++) {
			
			if(str.charAt(i)=='a') {
				collect_a++;
			}
			else if(str.charAt(i)=='v') {
				collect_v++;
			}
		}
		
		System.out.println("occurance of a is --> "+ collect_a);
		System.out.println("occurance of a is --> "+ collect_v);
		
	}

}
