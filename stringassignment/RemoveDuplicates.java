package week3.stringassignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 * g) Displaying the String without duplicate words	
		 */
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
		String str = " ";
	
		String[] t=text.split(" ");
		
		for (int i = 0; i < t.length; i++) 
		{
			boolean isDuplicate=false;
			
			for (int j = i+1; j < t.length; j++) 
			{
							if (t[i].equals(t[j])) 
				{
					
					isDuplicate=true;
					break;
					
				}
				
			}
			if (!isDuplicate) {
				
				str+= t[i] + " ";
				
			}			
		}
			str=str.trim();
			
			System.out.println(str);
		
	}

}
