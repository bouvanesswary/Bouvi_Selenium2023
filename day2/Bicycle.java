package week1.day2;

public class Bicycle {
	// AccessModifier returntype methodname inputarguments
	public int getCycleCount()
	{
		return 2;
		
	}
	
	// type method name ctrl+space  
	// if a method wants an input we can mention it in the arguments - 
	// it can be of any data type
	
	public String getCycleColor(String brandname, String Color) 
	{
	
		return brandname + " " + Color;
	//	return Color;
		
	}
	
	public int addTwonumbers(int num1 , int num2)
	{
		
		return num1+num2;
	}

	// return nothing 
	public void getOtp() 
	{
		// TODO Auto-generated method stub
		System.out.println("No!");

	}
	
	private void getCredit() 
	{
		// TODO Auto-generated method stub
		System.out.println("No!");

	}
	
	 void phone() 
	{
		// TODO Auto-generated method stub
		System.out.println("No!");

	}
	
	public static void main(String[] args) {
		
		// classname objectname = new classname
		// cycle - memory
		// objects to call variables
		
		Bicycle cycle= new Bicycle();
		System.out.println(cycle.getCycleCount());
		System.out.println(cycle.getCycleColor("Range", "yellow"));
		cycle.getOtp();
		cycle.getCredit();
		System.out.println(cycle.addTwonumbers(5, 6));
		
		
	}
}

