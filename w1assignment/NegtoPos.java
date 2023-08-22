package week1.w1assignment;

public class NegtoPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1 Problem statement: Convert a negative number to positive number
		---------------------------------------------------------------
		Pseudocode:
		-----------
		1. Initialize an integer with a negative number
		   like, int number = -40;
		2. Check if the number is a negative number 
		   Hint : any number that is lesser than zero is a negative number
		3. If so, convert the number to a positive numer
		
		4. Print as below
		        "The number -40 is converted to 40"
		
		
		2 Problem statement: Check if the number is positive or negative
		---------------------------------------------------------------
		Pseudocode:
		----------
		 1. Initialize a number, say, int number= 35;
		 2. If a number is positive, print "The number is positive"
		    If a number is negative, print "The number is negative"
		    If it nether negative nor positive, print as "The number is neither positive nor negative
		 
		 */
		
		
		int num=-40;
		int n;
		if(num<0)
		{
			n =-num;
			System.out.println("the number " + num + " is negative so changing it to positive " + n);
		}
		else if (num>0)
		{
			n=-num;
			System.out.println("the number " + num + " is positive so changing it to negative " + n);
		}
		else
		{
			System.out.println("the number " + num + " is neither negative nor positive ");
		}
			
		
		

	}

}
