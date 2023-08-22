package week1.day2;

public class ContinueStatement {
	public static void main(String[] args) {
	
		
		for (int i = 0; i < 10; i++) {
			
			
			if (i==3) {
				
				System.out.println("print if it is three");
				
				continue; //  will skip the current iteration and continue with loop
				
			}
			
			System.out.println("out of if break condition");
			
	
		System.out.println("Print me: " + i);
			
		}
		
		System.out.println("out of for loop");
	}
}

