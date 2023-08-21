package week1.w1assignment;

public class IsPrime {
	public static void main(String[] args) {
		
	
	
	/*
			 * int num = 29;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }
		
		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		  
	 * 	  int num = 33, i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	
	 *  a) Create a class by name: IsPrime
		b) Create a main method using shortcut
		c) Write a logic to find if the given number is prime or not
		d) Print if it is prime or not
		
		Hint: Iterate through all numbers from 2 to n-1 (input) and 
		for every number check if it divides n (input). 
		If we find any number that divides, print prime.
		If nothing divides, then print non-prime
	 */
/*	public static void main(String[] args) {
	
		int num = 33, i = 2;
	    boolean flag = false;
	    while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	*/
	
	int num = 29;
    boolean flag = false;{
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
	
}
}
	


