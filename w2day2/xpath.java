package week2.w2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	public static void main(String[] args) {
		
		
		/*
		 * 1. Launch http://leaftaps.com/opentaps
			2. Enter username as demoSalesManager (Use : Attribute based)
			3. Enter password as crmsfa (Use : Attribute based)
			4. Click on Login (Use : Attribute based)
			5. Click on CRM/SFA (Use Partial Text based xpath)
			6. Click on Leads(Use Text based)
		 */
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// get Title
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		// click on the login button
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		// click leads link
		
		driver.findElement(By.xpath("//a[contains(text(),' CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
		
		
	}

}
