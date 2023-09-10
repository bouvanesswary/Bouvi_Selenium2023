package week4.W4D1Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * // Declare a String as "PayPal India"
		 * 
		 * // Convert it into a character array
		 * 
		 * // Declare a Set as charSet for Character
		 * 
		 * // Declare a Set as dupCharSet for duplicate Character
		 * 
		 * // Iterate character array and add it into charSet
		 * 
		 * // if the character is already in the charSet then, add it to the dupCharSet
		 * 
		 * // Check the dupCharSet elements and remove those in the charSet
		 * 
		 * // Iterate using charSet
		 * 
		 * // Check the iterator variable isn't equals to an empty space
		 * 
		 * // print it
		 * 
		 */
		String str="PayPal India";
		char[] ch = str.toCharArray();
		
		Set <Character> charSet=new LinkedHashSet<>();
		Set <Character> dupCharSet=new LinkedHashSet<>();
		
		for (char c : ch) {
            if (!charSet.contains(c)) {
                charSet.add(c);
               
            } else {
                dupCharSet.add(c);
            
            }
         
        }
		System.out.print("Unique characters : ");
		for(char c: charSet)
		{
			if (c != ' ') 
			{
               System.out.print(c + "  ");
            }
		
			
		}
	
          System.out.println("Duplicate char : " +dupCharSet);
		
	}

}
