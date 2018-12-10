
public class TestCustomer {

	public static void main(String[] args) {
		
		Customer leeman = new Customer("Josh", "Leeman", 1000);
		Account leemanAccount = leeman.getAccount();
		leeman.getAccount().deposit(500);
		leeman.getAccount().withdraw(100);
		System.out.println(leeman.getAccount().getBalance());
		
		Customer noa = new Customer("Noa", "Rogoszinski", 500);
		Account noaAccount = noa.getAccount();
		noaAccount.deposit(1000);
		noaAccount.withdraw(10);
		System.out.println(noa.getFirst() + "'s balance is " + noa.getAccount().getBalance());

	}

}
