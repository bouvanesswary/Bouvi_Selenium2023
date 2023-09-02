package week3.w3day1;

public interface Browser {
	/*
	 * Rules : browser related activities:
	 * Launch browser
	 * LoadUrl
	 * VerifyTitle
	 * Close
	 * Quit
	 * 
	 * All the methods of all the methods in interface should be used 
	 * 100% abstract version 1.7
	 */
	
	public void startApp();
	
	/*
	 * This method should load the application
	 * in the specified browser
	 */
	
	public void loadURL(String URL);
	
	/*
	 * This method should load the URL
	 */
	
	public void close();
	/*
	 * This method close the broser
	 */


}
