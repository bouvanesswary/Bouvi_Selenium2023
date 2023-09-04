package week3.w3d2;
import java.util.Arrays;
public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {2,5,7,7,5,9,2,3};
		Arrays.sort(num);
	// One method	
		for (int i = 0; i < num.length; i++) {
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]);
			}
			
		}
		
		// second method Iterate through an outer for loop
	/*	for (int i = 0; i < num.length; i++) {
			
			// Iterate through inner forloop
			for (int j = i+1; j < num.length; j++) {
				// Compare both variables
				// if it is equal 
				if(num[i]==num[j])
					// print the array value
					System.out.println(num[i]);
			}
			
		}
		
	*/	
		

	}

}
