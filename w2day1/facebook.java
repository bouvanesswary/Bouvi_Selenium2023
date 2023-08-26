package week2.w2day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	private static WebElement webElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://www.facebook.com/login");
		
		// Calling all methods to maximize it 
		driver.manage().window().maximize();
		
		// To get the title of the browser
		
		System.out.println(driver.getTitle());
		
		
		// locate the input field
		// by.attribute name
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// click on the login button
		
		driver.findElement(By.className("submit")).click();
		
		
		
		// close the browser
		driver.close();
	
	}

}
