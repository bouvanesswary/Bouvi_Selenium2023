package javaChallengePractice.Java;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word= "canada";
		String reverse="";
		char[] c=word.toCharArray();
		
		for (int i = c.length-1; i>=0;i--) 
		{
			
			//System.out.print(c[i]);
			
			reverse+=c[i];
		}
		System.out.println(reverse);
		if (reverse.equals(word)) 
		{
			
			System.out.println("The given " + word + " is a Palindrome ");
			
		} else
		{
			System.out.println("The given " + word + " is not a Palindrome ");
		}
	}

}
