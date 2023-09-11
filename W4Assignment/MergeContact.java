package week4.W4Assignment;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * //Pseudo Code
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 2. Enter UserName and Password Using Id Locator
		 * 3. Click on Login Button using Class Locator
		 * 4. Click on CRM/SFA Link
		 * 5. Click on contacts Button
		 * 6. Click on Merge Contacts using Xpath Locator
		 * 7. Click on Widget of From Contact
		 * 8. Click on First Resulting Contact
		 * 9. Click on Widget of To Contact
		 * 10. Click on Second Resulting Contact
		 * 11. Click on Merge button using Xpath Locator
		 * 12. Accept the Alert
		 * 13. Verify the title of the page
		 */
	
		ChromeDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[3]")).click();
		driver.findElement(By.partialLinkText("Merge Contacts")).click();
		
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		//to switch to a particular index
		List<String> handles = new ArrayList<>(windowHandles);
		//switch to the particular window using index
		driver.switchTo().window(handles.get(1));
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id=\"ext-gen289\"]")).click();
		//driver.findElement(By.xpath("//div[@id=\"ext-gen293\"]/a")).click();
		
		driver.findElement(By.xpath("//img[@id=\"ext-gen616\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"ext-gen295\"]")).click();
		driver.findElement(By.className("buttonDangerous")).click();
		
		
		
		
		
	}

}
