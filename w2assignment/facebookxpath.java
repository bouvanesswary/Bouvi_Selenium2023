package week2.w2assignment;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Assignment:1
			FaceBook:
			================================
			// Step 1: Download and set the path 
			// Step 2: Launch the chromebrowser
			// Step 3: Load the URL https://en-gb.facebook.com/
			// Step 4: Maximise the window
			// Step 5: Add implicit wait
			// Step 6: Click on Create New Account button
			// Step 7: Enter the first name
			// Step 8: Enter the last name
			// Step 9: Enter the mobile number
			// Step 10: Enterthe password
			// Step 11: Handle all the three drop downs
			// Step 12: Select the radio button "Female" 
			            ( A normal click will do for this step) 

		 */
		
		ChromeDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click(); // Create new account
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("Test1FN"); /// First name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test1LN"); // ES - YS ( Scconf name
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("bou@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("87687576564");
		
		// dropdown
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select select = new Select(month);
		select.selectByValue("7");
		
	
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select select1 = new Select(day);
		select1.selectByValue("15");
		
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select select2 = new Select(year);
		select2.selectByValue("2011");
		
		
		// radiobutton
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/label")).click();
		//driver.findElement(By.xpath("//span[@class='_5k_3']//input[@value='2']")).click();
		//driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input")).click();
		
		driver.close();
		
		
	
	
	}

}
