package week4.W4Assignment;

import java.time.Duration;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		Actions action=new Actions(driver);
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		String title1 = driver.getTitle();
		driver.findElement(By.xpath("//button[@id=\"j_idt88:new\"]/span")).click();
		
		Set<String> pWindow = driver.getWindowHandles();
		List<String> winHandle = new ArrayList<>(pWindow);
		WebDriver window1 = driver.switchTo().window(winHandle.get(1));
		String title2 = driver.getTitle();
		// Confirm new window is opened or not
		if(title1 != title2)
		{
			System.out.println("New Window Opened");
		}
		
		driver.switchTo().window(winHandle.get(0));
		//Find the number of opened tab
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt91\"]")).click();
		Set<String> pWindow2 = driver.getWindowHandles();
		List<String> winHandle2 = new ArrayList<>(pWindow2);
		int tabsopen = winHandle2.size();
		System.out.println("List of tabs open " + pWindow2);
		System.out.println("Number of Tabs open " +tabsopen);
		
		// close all the tabs except main window
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt93\"]")).click();
		Set<String> pWindow3 = driver.getWindowHandles();
		List<String> winHandle3 = new ArrayList<>(pWindow3);
		
		for(String tab:winHandle3)
		{
			if(!tab.equals(winHandle3.get(0)))
			{
				driver.switchTo().window(tab);
				driver.close();
			}
			
			System.out.println("All sub tabs closed");
			
		}
	
		// wait for two new tabs to open
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt95\"]")).click();
		Set<String> pWindow4 = driver.getWindowHandles();
		List<String> winHandle4 = new ArrayList<>(pWindow4);
		Thread.sleep(4000);
		int size = winHandle4.size();
		System.out.println("Waited - the number of tabs opened are " + size);
		driver.close();
		
	}

}
