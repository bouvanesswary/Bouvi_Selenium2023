package week3.w3d2;

public class OnePlus extends AndroidTV implements Android{

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Play Video");
		
	}

	@Override
	public void OpenApp() {
		// TODO Auto-generated method stub
		System.out.println("Open the App");
		
	}
	public static void main(String[] args) {
		OnePlus one=new OnePlus();
		one.OpenApp();
		one.playVideo();
	}

}
