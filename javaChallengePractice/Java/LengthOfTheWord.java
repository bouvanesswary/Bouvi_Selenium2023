package javaChallengePractice.Java;

public class LengthOfTheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Given a string s consisting of words and spaces, return the length of the
		 * last word in the string.
		 * 
		 * A word is a maximal substring consisting of non-space characters only.
		 * Example 1:
		 * 
		 * Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with
		 * length 5. Example 2:
		 * 
		 * Input: s = "   fly me   to   the moon  " Output: 4 Explanation: The last word
		 * is "moon" with length 4. Example 3:
		 * 
		 * Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is
		 * "joyboy" with length 6.
		 * 
		 */

		String s = "Hello World";

		String[] word = s.split(" ");

		int len = word.length;

		for (int i = word.length - 1; i >= 0; i--) {

			System.out.println(" The Last word : " + word[i] + " > Length is " + word[i].length());

			break;

		}

		System.out.println("=====================================");

		String s1 = "   fly me   to   the moon  ";

		String word1 = s1.trim();

		String[] w = word1.split(" ");

		int len1 = w.length;

		for (int i = w.length - 1; i >= 0; i--) {

			System.out.println(" The Last word : " + w[i] + " > Length is " + w[i].length());

			break;

		}
		
		System.out.println("=====================================");

		String s2 = "luffy is still joyboy";

		String word2 = s2.trim();

		String[] w2 = word2.split(" ");

		int len2 = w2.length;

		for (int i = w2.length - 1; i >= 0; i--) {

			System.out.println(" The Last word : " + w2[i] + " > Length is " + w2[i].length());

			break;

		}

	}

}
