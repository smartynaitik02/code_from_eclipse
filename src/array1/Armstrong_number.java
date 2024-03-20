package array1;

public class Armstrong_number {

	public static void main(String[] args) {
 		 int P,num,Sum,Rem; //4 variable has been declared
		 num = 153; 
		 P = num;  
		               

		 for(Sum = 0 ; num>0 ; num=num/10) { //153>0  num=153/10 //num=15 15>0  //num = 15/10 //1 1>0 1/10 0.1
			 Rem = num % 10;	//Rem = 153%10 //3 ||| rem = 15%10 //rem =5 rem= 1%10 //rem=1
			 Sum = Sum + Rem*Rem*Rem; //sum = 0 + 27 //sum=27 //sum = 27+125/152 //sum = 152+1 =153
		 }
		
		 if(Sum == P ) //153==153
			 System.out.println("Armstrng number");
		 else 
			 System.out.println("Not armstrong number");
	}

}
