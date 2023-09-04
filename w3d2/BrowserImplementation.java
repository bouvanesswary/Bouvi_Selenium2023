package week3.w3d2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserImplementation implements Browser {
	

	
	public RemoteWebDriver driver;
	
	
	@Override
	public void loadURL(String URL) {
		// TODO Auto-generated method stub
		driver.get(URL);
		
	}
	@Override
	public void startApp() { 
		// local variable - all details inside this method are local
		// scope of this method ends here
		// TODO Auto-generated method stub
		 driver = new ChromeDriver();
		 
		
		
		
	}
	
	@Override
	public void startApp(String browser) {
		// TODO Auto-generated method stub
		
		switch (browser) {
		case "chrome" : 
			driver=new ChromeDriver();
			break;
		case "safari" : 
			driver=new SafariDriver();
			break;	
			
			default: break;
			
		
	}
		
/*
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
		
	}
	
	public void getTitle()
	{
		driver.getTitle();
	}
	
	public void Quit() {
		driver.quit();
	}
	

	
	public static void main(String[] args) {
		BrowserImplementation br=new BrowserImplementation();
		br.startApp();
		br.loadURL("http://leaftaps.com/opentaps/control/main");
		br.close();
	}




}

	@Override
	public void loadURL(String URL) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	*/
}

	

	public void close() {
		// TODO Auto-generated method stub
		
	}
}
	
