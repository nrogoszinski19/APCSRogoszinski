public class CheckingAccount extends Account {
	
	private double overdraftAmount;
	
	public CheckingAccount(double initBalance, double overdraft){
		super(initBalance);
		overdraftAmount = overdraft;
	}
	
	public CheckingAccount(double initBalance){
		super(initBalance);
	}
	
	public boolean withdraw(double amt) {
		boolean afford = true;
		double total = balance + overdraftAmount;
		if(total-amt<0) {
			afford = false;
			System.out.println("Withdraw " + amt + ": " + afford);
		}
		else {
			if(amt>balance){
				overdraftAmount = overdraftAmount - (amt-balance);
				balance = 0;
			}
			else {
				balance = balance - amt;
			}
			afford = true;
			System.out.println("Withdraw " + amt + ": " + afford);
		}
		return afford;
	}
	
	public double getOverDraft() {
		return overdraftAmount;
	}
	
}
