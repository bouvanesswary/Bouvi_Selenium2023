package week3.ArrayAssignment;
import java.util.Arrays;
public class FirstSecondLargest {
	public static void main(String[] args) {
		
		// Here is the input
				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
		
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int len=data.length;
		System.out.println("Print the second Largest number in an array " + data[len-2] );
		
	}
}

