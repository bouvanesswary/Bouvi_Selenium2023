package week2.w2day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sales {

	private static WebElement webElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		
		// Calling all methods to maximize it 
		driver.manage().window().maximize();
		
		// To get the title of the browser
		
		System.out.println(driver.getTitle());
		
		
		// locate the input field
		// by.attribute name
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		
		// click on the login button
		
		driver.findElement(By.id("Login")).click();
		
		
		
		// close the browser
		driver.close();
	
	}

}
