package practice;

public class SwitchStatement2 {

	public static void main(String[] args) {
		
	int day =1;
		
		switch(day){
		
		case 1:
			System.out.println("mon");
			
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thr");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("sun");
			break;
//		default:
//			System.out.println("Enter right day value");
			

	}
		
		String str = "Welcome";
		
		switch(str) {
		
		case "Rohit":
			System.out.println("it is rohit");
			break;
		case "Virat":
			System.out.println("it is virat");
			break;
		case "Welcome":
			System.out.println("it is welcome");
			break;
		default:
			System.out.println("no value is matching");
		}

	}
}
