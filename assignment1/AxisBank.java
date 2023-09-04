package week3.assignment1;

public class AxisBank extends BankInfo {
	
	// You have to override the method deposit in AxisBank.
	public void deposit() {
		System.out.println("show the balance of the deposited amount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis=new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();

	}

}
