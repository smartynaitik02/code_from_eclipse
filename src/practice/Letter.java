package practice;

public class Letter {

	public static void main(String[] args) {
		String name = "kohli";
		int len = name.length();
		char arr[] = new  char[len];
		
		for(int i=0;i<len;i++) {
			
			arr[i]= name.charAt(i);
		}
		
		for(char ch: arr) {
			System.out.println(ch);
		}

	}

}
