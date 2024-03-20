package practice_que_2;

public class Coun_char {

	public static void main(String[] args) {
		
		String name= "shravan";
		int count =0;
		for(int i=0; i<name.length();i++) {
			
			if(name.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("count of a is --> " + count );

	}

}
