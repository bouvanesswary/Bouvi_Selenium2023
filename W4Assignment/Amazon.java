package week4.W4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Assignment 2Amazon
		1.Load the URL https://www.amazon.in/
		2.search as oneplus 9 pro 
		3.Get the price of the first product
		4. Print the number of customer ratings for the first displayed product
		5. Click the first text link of the first image
		6. Take a screen shot of the product displayed
		7. Click 'Add to Cart' button
		8. Get the cart subtotal and verify if it is correct.
		9.close the browser
		 */
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/ref=nav_logo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Get the price of first product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String firstprodprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]")).getText();
		//String firstprice = firstprodprice.replaceAll(",", "");
		System.out.println("The price of first product is : " +firstprodprice);
		
	
		//Print the number of customer ratings for the first displayed product
		//String firstreview = driver.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-small')]")).getText();
		//Thread.sleep(3000);
		String firstreview = driver.findElement(By.xpath("//span[@class='a-size-base puis-normal-weight-text']")).getText();
		//span[@class='a-size-base puis-normal-weight-text']
		//String firstreview = driver.findElement(By.xpath("//span[@class='a-size-base puis-bold-weight-text']")).getText();
		System.out.println("First product review : " + firstreview);
		
		//Click the first text link of the first image
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'a-size-base-plus')]/parent::a")).click();
	
		//Click 'Add to Cart' button
		//Thread.sleep(3000);
		driver.findElement(By.name("submit.add-to-cart")).click();
	
		//Get the cart subtotal and verify if it is correct.
		Thread.sleep(3000);
		String grandtotal = driver.findElement(By.xpath("//*[@id=\"sw-subtotal\"]/span[2]/span/span[2]/span[2]")).getText();
		System.out.println(grandtotal);
		
		if(firstprodprice.equals(grandtotal))
		{
			System.out.println("Price Verified and it is : "+ grandtotal);
		}
		else
		{
			System.out.println("Grand total is not matching the product chosen " + grandtotal);
		}
		
		
		//close the browser
	
		driver.close();
		

	}

}
