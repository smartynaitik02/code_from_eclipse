package array1;

public class Armstrong {

	public static void main(String[] args) {
		//153 = 1+125+27 = 153
		
		int num = 153;
		int num1 =0;
		for(int i = 3; i>0;num1=num1%10) {
			num1 = num/10; //15
			 // 1
			num1 = num1*num1*num1;
			
			
		}
		System.out.println(num1);
	}

}
