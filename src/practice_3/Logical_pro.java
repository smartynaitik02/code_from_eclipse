package practice_3;

public class Logical_pro {

	public static void main(String[] args) {
		
		String arr1[] = new String[3];
		//arr1[]
		arr1[0] = "pyton";
		arr1[1] = "java";
		arr1[2] = "php";
		
		
		
		
		String arr2[] =  new String[3];
		
		arr2[0] = "sql";
		arr2[1] = "mysql";
		arr2[2] = "java";
		//arr2[3] = "sql";
		
		
		//{"sql", "mysql","oracle","java"};
		for(int i=0; i<arr1.length; i++) {
			
			
			for(int j=0 ; j<arr2.length;j++) {
				
				//if(arr1[i].equals(arr2[j])){
				if(arr1[i]==arr2[j]){
					
					System.out.println(arr1[i]);
					
					
				}
				
				
				
			}
		}
		
		
		
		
		

	}

}
