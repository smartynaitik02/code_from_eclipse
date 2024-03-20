package practice_3;

public class For_star {

	public static void main(String[] args) {

		for(int i =0;i<=4;i++){
	           
	           for(int j=0;j<=4;j++){
	               
	               if(j+i>=4){
	                   System.out.print("*");
	                }
	                else{
	                    System.out.print(" ");
	                }
	           }
	           System.out.println();
	       }

	}

}
