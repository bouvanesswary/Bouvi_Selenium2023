package week3.w3d2;

public class ExecutionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserImplementation bi=new BrowserImplementation();
		
	
		bi.startApp("chrome");
		bi.loadURL("http://leaftaps.com/opentaps/control/main");
		bi.close();
		
		

	}

}
