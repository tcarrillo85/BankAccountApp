public class Checking extends Account {
	// attributes
	private int debitCardNumber;
	private int debitCardPIN;
	
	
	// Constructor 
	public Checking(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setDebitCard() {
		// Private so it cannot be seen
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Checking Account");
		super.showInfo();
		System.out.println("* Your Checking Account Features:" +
				"\n- Debit Card Number: " + debitCardNumber +
				"\n- Debit Card PIN: " + debitCardPIN
				);
	}
}