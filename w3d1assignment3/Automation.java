package week3.w3d1assignment3;

public class Automation extends MultipleLanguage implements Testtool,Language {

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("One of the language is Ruby");
		
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("One of the language is Java");
		
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Tool used is Selenium");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation auto=new Automation();
		auto.python();
		auto.ruby();
		auto.selenium();
		auto.java();
		

	}

	


}
