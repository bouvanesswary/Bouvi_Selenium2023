package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=3;
	      int temp;
	      int i;
	     
	      
	      for(i= num-1;i>=1;i--)
	      { 
	       temp = num*i;
	        num =  temp;
	        
	      }
	      
	      System.out.println(num);
	      
	      
	      

	}

}
