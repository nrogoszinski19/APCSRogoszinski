public class CheckingAccount extends Account {
	
	protected double overdraftAmount;
	
	public CheckingAccount(double initBalance, double overdraft){
		super(initBalance);
		overdraftAmount = overdraft;
	}
	
	public CheckingAccount(double initBalance){
		super(initBalance);
	}
	
	public boolean withdraw(double amt) {
		boolean afford = false;
		if(amt > balance) {
			if(amt < overdraftAmount) {
				afford = true;
			}
		}
		else if(amt < balance) {
			afford = true;
		}
		return afford;
	}
	
}
