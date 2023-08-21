package week1.w1assignment;

public class Fibonacci {
	
	/*
	 * a) Create a class by name: Fibbinocci
	   b) Create a main method using shortcut
	   c) Write a logic to print fibbinocci from 0 to 56
	   
	 * Hints: 

		Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		Print first number
		Iterate from 1 to the 11
		Add first and second number assign to sum
		Assign second number to the first number
		Assign sum to the second number
		Print sum

	 */

		public static void main(String[] args) {
			
			int firstNum=0;
			int secNum=1;
			int count=9;
			
			System.out.println("Fibonacci series are  :");
			System.out.println(firstNum);
			System.out.println(secNum);
			
			
			for (int i = 1; i <= count; ++i) { 
					
		    int sum=firstNum+secNum; // sum = 0+1 = 1
		    
		    System.out.println(sum); // Second value is 1
			
			firstNum = secNum; // FN= 1
			
			secNum = sum; // secNum = 1
			
			
			}
			
				
				
			}
			
		}
	
	

