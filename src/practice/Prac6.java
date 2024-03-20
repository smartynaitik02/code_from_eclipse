package practice;

public class Prac6 {

	public static void main(String[] args) {
		//palin string
		
		String name = "madam";
		String name1 = name;
		int len = name.length();
		String str = "";
		
		for(int i=len-1;i>=0;i--) {
			
			str = str + name.charAt(i);
		}
		System.out.println(str);

	}
	

}
