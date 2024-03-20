package practice_que;

public class Rev_each_word {

	public static void main(String[] args) {
		
		String s1 = "Velocity training centre";
		
		int len= s1.length();
		System.out.println(len);
		
		System.out.println(s1.indexOf('e',s1.indexOf('e',s1.indexOf('e')+1)+1));

	}

}
