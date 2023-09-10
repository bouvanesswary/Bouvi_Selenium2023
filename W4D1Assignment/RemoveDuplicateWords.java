package week4.W4D1Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 *
		 *Output= We learn java basics as part of sessions in week1
		 *
		 * Psuedocode
		 *
		 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		 * c) Create a empty Set 
		 * d) Iterate the String array
	                 d.1) add each word into Set
		 * e) Print the Set values which is having unique words
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set< String> str= new LinkedHashSet<>();
		for (int i = 0; i < split.length; i++) {
			
			str.add(split[i]);
		}
		
		System.out.println(str);
		
		
	}

}
