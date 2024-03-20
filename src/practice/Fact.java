package practice;

public class Fact {

	public static void main(String[] args) {
		int num = 6;
		
		int fact_sum= 1;
		for(int i=1;i<=6;i++) {
			
			fact_sum = fact_sum*i;
			
		}
		
		System.out.println(fact_sum);

	}

}
