package week4.W4D1Assignment;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */
		
		int[] data = {1,2,2,3,4,5,6,8,9,10};	
		Set<Integer> num= new TreeSet<>();
		for (int j = 0; j < data.length; j++) {
			num.add(data[j]);

		}
		int size = num.size();
		System.out.println("The Integer numbers are as follows : " + num);
		System.out.println("=======================================");
		
		int missingnumber=1;
		for (int nums:num) 
		{
			
			if(nums != missingnumber)
			{
				System.out.println("The missing number is : " + missingnumber);
				break;
			}
		missingnumber++;
			
		}

		
		
		
		
	}

	}

