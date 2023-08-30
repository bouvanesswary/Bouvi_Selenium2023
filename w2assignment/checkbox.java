package week2.w2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		Checkbox
		=======
		https://www.leafground.com/checkbox.xhtml
		 */

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		
		// Basic Checkbox
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		
		
		// Notification
		WebElement notification=driver.findElement(By.xpath("//div[@id=\"j_idt87:j_idt91\"]/div[2]"));
		notification.click();
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println("After checkbox is checked: the Notification appears as  : "+s);
		notification.click();
		Thread.sleep(3000);
		String s1=driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println("After unchecking the checkbox: the Notification appears as : " + s1);
		
		
		
		// Choose your favorite language(s)
		
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[6]")).click();
		
		/*
		String c1=driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[2]")).getText();
		String c2=driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[4]")).getText();
		String c3=driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[6]")).getText();
		String c4=driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[8]")).getText();
		String c5=driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[8]")).getText();
		*/
		
		// Tri State Checkbox
		
		driver.findElement(By.xpath("//div[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
        String v1= driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p[1]")).getText();
		String s2=driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[1]")).getText();
		System.out.println(s2 + v1);
		
		driver.findElement(By.xpath("//div[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
		Thread.sleep(3000);
		String v2= driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p[1]")).getText();
		String s3=driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[1]")).getText();
		System.out.println(s3 + v2);
		

		driver.findElement(By.xpath("//div[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
		Thread.sleep(3000);
		String v3= driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p[1]")).getText();
		String s4=driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[1]")).getText();
		System.out.println(s4 + v3);
	
		// Toggle Switch
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String tog=driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[1]")).getText();
		System.out.println(tog);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Thread.sleep(3000);
		String tog1=driver.findElement(By.xpath("//div[@class='ui-growl-message']//span[1]")).getText();
		System.out.println(tog1);
		
		
		// Verify if check box is disabled
		boolean check=driver.findElement(By.xpath("//div[@id=\"j_idt87:j_idt102\"]/div[2]")).isDisplayed();
		System.out.println("Check box disabled :" + check);
		
		
		// Select Multiple
		
		driver.findElement(By.xpath("//div[@role='combobox']//ul[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[5]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[6]/div/div[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@role='combobox']//ul[1]")).getText());
		
	}

}
