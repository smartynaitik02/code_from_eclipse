package practice;

public class Prac15 {

	public static void main(String[] args) {
		
//		int i =1;
//		int j = i++; //i=2, 1
//		
//		System.out.println(i);
//		System.out.println(j);
		
		
		
//		int i =1;
//		int j=++i;// 1+i=i
//		
//		System.out.println(i);
//		System.out.println(j);
		
		
		int i=5;
		//int j=i++ + 10;
		//int j=10 + ++i;
		int j = i++ + ++i;
				//5 + 7
		//i = i+1 //6
		//i+1 =i //7
		
		System.out.println(i); //7
		System.out.println(j); //12
	}

}
