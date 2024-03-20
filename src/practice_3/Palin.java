package practice_3;

public class Palin {

	public static void main(String[] args) {
		 int num = 153;
	        int rem =0;
	        int rev =0;
	        int temp = num;
	        
	        
	        while(num!=0){
	            rem = num%10; //rem =3 //5
	            rev = rev*10 +rem; //30+0 //50+30
	            num= num/10; //15 //5
	            }
	            
	            System.out.println(num);
	        

	}

}
