package week1.day2;

public class Operators {
	
	public static void main(String[] args) {
		
		int a= 5;
		int b= 6;
		
		// Arithmetic Operators
		System.out.println("*************   Arithmetic Operators    **************");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // quotient
		System.out.println(a%b); // reminder
		System.out.println("*************         Relational Operators    **************");
		// Relational Operators
		System.out.println(a>b || a<b);// OR operator False either one should be right
		System.out.println(a>b && a<b);// AND Operator true both the conditions should match
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println("*************         Compare Operators    **************");
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println("************   Incremental    ***************");
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(a);
			
	}

}
