package javaChallengePractice.Java;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
			Given a string s, return true if it is a palindrome, or false otherwise.
			Example 1:
			
			Input: s = "A man, a plan, a canal: Panama"
			Output: true
			Explanation: "amanaplanacanalpanama" is a palindrome.
			Example 2:
			
			Input: s = "race a car"
			Output: false
			Explanation: "raceacar" is not a palindrome.
			Example 3:
			
			Input: s = " "
			Output: true
			Explanation: s is an empty string "" after removing non-alphanumeric characters.
			Since an empty string reads the same forward and backward, it is a palindrome.
		 */
			//String s="A man, a plan, a canal: Panama";
			//String s= "race a car";
			String s=" ";
			char charAt = 0;
			String lowerCase = s.toLowerCase();
			String replaceAlls = lowerCase.replaceAll(",", "").replaceAll(":", "").replaceAll(" ", "");
			//String[] split = replaceAlls.split("");	
			System.out.println(replaceAlls);
			
			char[] charArray = replaceAlls.toCharArray();
			String rev="";
			
			for (int i = charArray.length-1;i>=0;i--) {
				
				char reverse = replaceAlls.charAt(i);
				rev+=reverse;
			
			}
			//System.out.print(rev);
			
			System.out.println( " " );
			if(replaceAlls.equals(rev))
			{
				System.out.println(rev + ": is a Palindrome ");
			}
			else
			{
				System.out.println(rev + ": is not a Palindrome ");
			}
			
			
			
			/*
			for (int i = replaceAlls.length()-1;i>=0; i--) 
			{
				charAt = replaceAlls.charAt(i);
				
				System.out.print(charAt);	
			}
			
			if(replaceAlls.equals(charAt))
			{
				System.out.println(charAt + ": is a Palindrome ");
			}
			else
			{
				System.out.println(charAt + ": is not a Palindrome ");
			}
			*/
		
	}

}
