
public class TestChecking {

	public static void main(String[] args) {
		
		CheckingAccount OwenBryant = new CheckingAccount(500);
		CheckingAccount TimSoley = new CheckingAccount(500, 500);
		
		OwenBryant.withdraw(150);
		System.out.println("Deposit 22.25");
		OwenBryant.deposit(22.25);
		OwenBryant.withdraw(47.62);
		OwenBryant.withdraw(400);
		System.out.println("Customer Owen Bryant has a balance of " + OwenBryant.getBalance());
		
		System.out.println();
		
		TimSoley.withdraw(150);
		System.out.println("Deposit 22.25");
		TimSoley.deposit(22.25);
		TimSoley.withdraw(47.62);
		TimSoley.withdraw(400);
		System.out.println("Customer Tim Soley has a balance of " + TimSoley.getBalance() + " and an overdraft amount of " + TimSoley.getOverDraft());
	}

}
