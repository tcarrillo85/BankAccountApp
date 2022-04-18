public class Savings extends Account {
	// attributes
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	
	// Constructor 
	public Savings(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	// method 
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Savings Account");
		super.showInfo();
		System.out.println(
				"  YOUR SAVINGS ACCOUNT FEATURES: " +
				"\n* Safety Deposit Box ID: " + this.safetyDepositBoxID +
				"\n* Safety Deposit Box Key: " + this.safetyDepositBoxKey
				);
	}
}