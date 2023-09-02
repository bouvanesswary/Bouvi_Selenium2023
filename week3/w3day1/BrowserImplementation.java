package week3.w3day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserImplementation implements Browser {
	
	public ChromeDriver driver;
	
	

	@Override
	public void startApp() { 
		// local variable - all details inside this method are local
		// scope of this method ends here
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
		
	}
	
	public void Quit() {
		driver.quit();
	}
	

	@Override
	public void loadURL(String URL) {
		// TODO Auto-generated method stub
		driver.get(URL);
		
	}
	public static void main(String[] args) {
		BrowserImplementation br=new BrowserImplementation();
		br.startApp();
		br.loadURL("http://leaftaps.com/opentaps/control/main");
		br.close();
	}


}
