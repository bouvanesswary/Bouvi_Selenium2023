package week1.w1assignment;

public class TwoWheeler {
			
			/*
			Assignment 3
			Create a class for TwoWheeler and declare below variables with appropriate values
			int noOfWheels
			short noOfMirrors
			long chassisNumber
			boolean isPunctured
			String bikeName
			double runningKM
			create object for TwoWheeler and call all the variables inside main method and print the values.
			 
			 */
	
	
	
	private int noOfWheels(int num)
	{
		return num;
		
	}
	
	public short noOfMirrots(short no)
	{
		return no;
		
	}
	public long chassisNumber(long chas)
	{
		return chas;
		
	}
	public void isPunctured(boolean boo)
	{
		System.out.println("No");
		
	}
	public String bikeName(String name)
	{
		return name;
		
	}
	public void runningKM(double km)
	{
		System.out.println("Kilometers ran :" + km);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheeler two = new TwoWheeler();
		System.out.println(two.noOfWheels(1234));
		System.out.println(two.bikeName("KTC"));
		two.isPunctured(true);
		System.out.println(two.chassisNumber(23412341));
		System.out.println(two.noOfMirrots((short) 4));
		two.runningKM(100.0);
		
		}

}
