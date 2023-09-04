package week3.stringassignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		
		d)split the words and have it in an array
		
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end). 
	*/
		
		String test = "I am a software tester";
		String[] s=test.split(" ");
		
		for (int i = 0; i < s.length; i++) 
		{
			int j;
			if(i%2==0)
			{
				char[] c=s[i].toCharArray();
				String evenstring="";
				for (j = c.length-1 ; j>=0; j--) 
				{
					// reverse the char of even words
					//evenstring=Character.toString(c[j]);
					evenstring +=c[j];
					
				}
				System.out.print(evenstring + " ");
			}
			else
			{
				System.out.print(s[i] + " ");	
			}
			
			
			
		}
	}

}
