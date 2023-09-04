package week3.stringassignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

			String a="madam";
			String rev="";
			
		    char[] c =a.toCharArray();
		    
		    
		   for (int i = c.length-1; i>=0; i--) {
			   
			 rev+=a.charAt(i);
			
		}
		   System.out.println(rev);
		   
	}

}
