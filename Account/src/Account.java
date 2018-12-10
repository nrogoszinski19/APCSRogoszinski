
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
	
	public boolean withdraw2(double amt) {
		boolean afford = false;
		double balance2 = balance - amt;
		if(balance2 >= 0)
			return true;
		else
			return false;
	}

}