package week3.ArrayAssignment;

public class MissingElement {
	public static void main(String[] args) {
		
	/*
	 * int[] arr = {1,2,3,4,7,6,8};
	   loop through the array (start i from arr[0] till the length of the array)
	   check if the iterator variable is not equal to the array values respectively
	   print the number
	   once printed break the iteration
	 */
		int[] arr = {1,2,3,4,7,6,8};
		int a=arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (i +1 != arr[i]) {
				System.out.println(i+1);	
				break;
			}
			
			
		}
			
		}
		
	}


