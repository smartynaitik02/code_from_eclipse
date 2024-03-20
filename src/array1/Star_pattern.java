package array1;

public class Star_pattern {

	public static void main(String[] args) {
		
		
		for(int i =0;i<=4;i++) { //i=0 i=1 i=2
			
			for(int j=0;j<=5;j++) { //j=0 j=0 j=0
				
				if(j<=i) { //0<=0 1<=0 || 0<=1 1<=1 2<=1 || 0<=2 1<=2 2<=2 2<4 1<5
					System.out.print("");	
				}
				else {
					System.out.print("*"); // 1<0 2<0 3<0 4<0 5<0
				}

				}
			System.out.println("");
			}
		}

}


