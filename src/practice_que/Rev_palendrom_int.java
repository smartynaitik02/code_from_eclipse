package practice_que;

public class Rev_palendrom_int {

	public static void main(String[] args) {
		int n = 123;
		int rem=0;
		int rev=0;
		
		while(n!=0) {    //123 is not equal to zero                          //123!=0 //12!=0 //1!=0 //0!=0 false
			rem=n%10;      //rem=3 //rem=2   //rem=1                    //rem =3 //rem =2 //rem =1
			rev=rev*10+rem;   //rev=3 //rev=30+2=32 //rev= 320+1=321                    //rev=3 //30+2, rev=32 //320+1 , rev= 321
			n=n/10;     //n= 12  //   n=1  //0                     //12 //n=1 // n=0
			
		}
		System.out.println(rev); //321

	}

}
