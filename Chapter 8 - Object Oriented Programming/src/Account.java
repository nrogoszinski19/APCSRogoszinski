
public class Account {
	protected double balance;

	public Account(double initBalance) {
		balance = initBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
	}

	public void withdraw(double amt) {
		balance = balance - amt;
	}

}