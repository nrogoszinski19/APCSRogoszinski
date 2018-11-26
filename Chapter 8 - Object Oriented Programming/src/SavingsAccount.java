public class SavingsAccount extends Account{
	
	protected double interestRate;
	
	public SavingsAccount(double initBalance, double rate){
		
		super(initBalance + (rate*initBalance));
		interestRate = rate;
		
	}
	
}