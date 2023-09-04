package week3.w3d2;

public class Samsung extends AndroidTV implements Android {

	@Override
	public void OpenApp() {
		// TODO Auto-generated method stub
		System.out.println("Open the App");
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Play Video");
		
	}

	public static void main(String[] args) {
		Samsung sam=new Samsung();
		sam.OpenApp();
		sam.playVideo();
	}
}
