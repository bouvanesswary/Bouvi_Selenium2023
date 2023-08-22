package week1.day2;

public class Learnbreak {
	public static void main(String[] args) {
	
		
		for (int i = 0; i < 10; i++) {
			
			
			if (i==3) {
				
				System.out.println("print if it is three");
				
				break; // If no break is given then it will print till 9
				
			}
			
			System.out.println("out of if break condition");
			
	
		System.out.println("Print me: " + i);
			
		}
		
		System.out.println("out of for loop");
	}
}

