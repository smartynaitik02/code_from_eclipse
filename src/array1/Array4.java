package array1;

public class Array4 {

	public static void main(String[] args) {

		int buds[] = new int[1000];
		buds[0] = 90;
		buds[1]= 100;

		
		System.out.println(buds[2]); //
		
		
		
		
		
		
		
		
		
		
		
		
		
		int buds1[] = {1000,2000,3000};
//		System.out.println(buds1[2]);
		System.out.println(buds1[2]); //out bound exception
		
		int len = buds1.length;
		
//		System.out.println(len);
					
		for(int i=0;i<len;i++) {
			
			System.out.print(buds1[i] + " ");
		}
		
		
		

	}

}
