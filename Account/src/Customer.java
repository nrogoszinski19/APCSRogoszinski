
public class Customer {
	
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f, String l, double balance) {
		firstName = f;
		lastName = l;
		account = new Account(balance);
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public Account getAccount() {
		return account;
	}

}
