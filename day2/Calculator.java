package week1.day2;

public class Calculator {
	
	private int addTwonumbers(int num1 , int num2)
	{
		
		return num1+num2;
	}
	
	public float multi(float num1 , int num2)
	{
		
		return num1*num2;
	}
	public int sub()
	{
		int num1=9;
		int num2=10;
		int num3;
		System.out.println(num3=num1-num2);
		return num3;
	}
	

public static void main(String[] args) {
	
	Calculator Cal= new Calculator();
	System.out.println(Cal.addTwonumbers(5, 6));
	System.out.println(Cal.multi(6f, 7));
	Cal.sub();
}

}
