package week4.W4D1Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String text = "Bouvanesswary";
		String chlc = text.toLowerCase();
		char[] ch = chlc.toCharArray();
		
		Set<Character> name= new HashSet<>();
		for (int j = 0; j < ch.length; j++) {
			name.add(ch[j]);
		
		}
		
		System.out.println(name);
		
	}

}
