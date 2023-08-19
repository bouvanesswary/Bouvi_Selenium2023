package week1.day1;

public class SwitchCondition {
	public static void main(String[] args) {
		String browser = "chrome";
		
		switch (browser) {
		case "chrome":System.out.println("open chrome");break;
		case "safari":System.out.println("open safari");break;
		case "edge":System.out.println("open edge");break;
		default:
			System.out.println("open any default browser");
			break;
		}
	}


}
