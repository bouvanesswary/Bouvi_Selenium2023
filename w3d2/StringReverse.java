package week3.w3d2;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Reverse the String
		==================
		String  input=“TestLeaf";
		Goal: To understand the String,loop
		a)Convert the String to character array (use toCharArray)
		b)Use for loop to iterate through each character (from end to go to the first)
		c)Print the Characters continuously
		*Hint  Use  system.out.print() 
		
*/
		String input="testleaf";
		char[] c=input.toCharArray();
		System.out.println(c);
		
		for (int i =c.length-1;i>=0 ;i--) {
			
			System.out.println(c[i]);
			
		}
		
		
		
	}

}
