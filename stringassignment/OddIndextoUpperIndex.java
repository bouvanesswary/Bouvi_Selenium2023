package week3.stringassignment;

public class OddIndextoUpperIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Pseudo Code
		 * Declare String Input as Follow 
		 * String test = "changeme";
		 * a) Convert the String to character array
		 * b) Traverse through each character (using loop)
		 * c)find the odd index within the loop (use mod operator)
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		 */
		String test = "changeme";
		char[] c=test.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			
			if (i%2 != 0) {
				
				c[i]= Character.toUpperCase(c[i]);
				
				
				System.out.print(c[i] + " ");
	
			}
			else
			{
				System.out.print(c[i]+ " ");

			}
			
		}
	}

}
