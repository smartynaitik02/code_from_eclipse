package practice_3;

public class Rev_each {
	
	public static void main(String[] args) {
        //System.out.println("Hello, World!");
        String str = "Velocity Pune";
        String arr []= str.split(" ");
        
        int len = arr.length;
        
        String blank ="";
        
        for(String word: arr){
            String store = word;
            String str1 = "";
            for(int i=store.length()-1;i>=0;i--){
                
                str1 = str1 + store.charAt(i);
                
                
            }
            blank = blank+str1;
        }
        
        System.out.println(blank);
            
        
        
        
    }
	
	
	

}
