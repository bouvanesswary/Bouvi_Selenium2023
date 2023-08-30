package week2.w2assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class leaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * create , edit , delete and update
			 * https://github.com/TestLeafPages/SeleniumAssignments/tree/master/week2/day2.assignments
			 */
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Calling all methods to maximize it 
		driver.manage().window().maximize();
		
		// To get the title of the browser
		
		System.out.println(driver.getTitle());
		
		
		// locate the input field
		// by.attribute name
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// click on the login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// click leads link
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Sele");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("BouTestF1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BouTestL1");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("BouTestFNLocal1");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BouTestDep1");
		// name: departmentName
		driver.findElement(By.id("createLeadForm_description")).sendKeys("BouTestDesc1");
		// description
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Boutest1@gmail.com");
		// Return type for findelement is webelement
		WebElement dd= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		// Instantiate Select class
		Select s= new Select(dd);
		s.selectByValue("AK");
		driver.findElement(By.name("submitButton")).click();
		
		// Edit
		
		System.out.println(driver.getTitle()); 
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("BouTestnotes1");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle()); 
		
		// Duplicate
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButton']")).click();
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this one is duplicate");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		// Delete
		
		driver.findElement(By.linkText("Delete")).click();
		
		
		// close the browser
	    driver.close();
	}

}
