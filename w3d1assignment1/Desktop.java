package week3.w3d1assignment1;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println(" Desktop size is 17' ");
		
	}
	
	public static void main(String[] args) {
	
		Desktop desk=new Desktop();
		desk.computerModel();
		desk.desktopSize();
		
	}
}
