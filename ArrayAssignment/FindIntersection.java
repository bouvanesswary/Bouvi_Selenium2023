package week3.ArrayAssignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		boolean found= false;
		
		int len1=array1.length;
		int len2=array2.length;
		
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				if(array1[i]==array2[j])
				{
					System.out.println("Print the First array that matches both "
							+ "arrays " + array1[i]);
					found=true;
					
				}
				if (found) {
					
					break;
					
				}
				
			}
			
		}
	}

}
