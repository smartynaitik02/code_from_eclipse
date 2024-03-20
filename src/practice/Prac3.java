package practice;

public class Prac3 {
	// armstong number
	public static void main(String[] args) {
		int num = 153;
		int rem = 0;
		int sum = 0;

		while (num != 0) {
			rem = num % 10; // 3
			sum = rem+ sum;
			num = num / 10;

		}
		
		System.out.println(sum);

	}

}
