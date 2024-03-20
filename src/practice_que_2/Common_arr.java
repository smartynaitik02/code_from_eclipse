package practice_que_2;

public class Common_arr {
	
	//Write a Java program to find common elements between two integer arrays.  int arr[] = {1,2,4,5,6,7};  
	//int arr1[] = {1,2,43,5,66,73}; 
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,40,5,6,7};
		int arr1[] = {1,2,43,5,66,73}; 
		
		int collect = 0;
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j =0;j<arr1.length;j++) {
				
				if(arr[i]==arr1[j]) {
					System.out.println("the common element is --> "+ arr[j]);
					collect++;
				}
				
			}
			
			
		}
		
		if(collect==0) {
			System.out.println("no common element found");
		}

	}

}
