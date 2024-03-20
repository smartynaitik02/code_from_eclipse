package practice_que_2;

public class prac {
	//write for armsstrong number and adding the given num just replace like 13 with sum = rem+ sum;
	public static void main(String[] args) {
		int rem;
		int num = 153;
		int sum =0;
		int p =num;
		
		while(num!=0) { //15 //1
			rem = num%10; //3 //5 //1
			sum = rem+ sum*10; // sum = 0+27 //27+125+ //152+1
			num = num/10; //15 //1 //0
			
		}
		System.out.println(sum);
		
		if(p==sum) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not armstrong");
		}
		
		

	}

}
