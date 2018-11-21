
public class TestAccount {

	public static void main(String[] args) {
		
		Account myAccount = new Account(100);
		
		System.out.println("Initial Balance: $" + myAccount.getBalance());
		
		myAccount.deposit(50);		
		myAccount.withdraw(147);
		
		System.out.println("Final Balance: $" + myAccount.getBalance());
				
	}

}
