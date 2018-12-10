
public class Bank {

	private Customer[] customers = new Customer[100];
	private int numberOfCustomers;	//keep track of how many spots in the array are filled
	
	public Bank() {
		numberOfCustomers = 0;
	}
	
	public void addCustomer(String f, String l, int initBalance) {
		Customer c = new Customer(f, l, initBalance);
		numberOfCustomers = numberOfCustomers + 1;	//updates number of customer objects
		customers[numberOfCustomers] = c;	//place customer object into array
	}
	
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}
