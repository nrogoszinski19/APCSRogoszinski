
public class Bank {

	private Customer[] customers = new Customer[100];
	private int numberOfCustomers;	//keep track of how many spots in the array are filled
	
	public Bank() {
		numberOfCustomers = 0;
	}
	
	public void addCustomer(String f, String l, double initBalance) {
		Customer c = new Customer(f, l, initBalance);
		customers[numberOfCustomers] = c;	//place customer object into array
		numberOfCustomers = numberOfCustomers + 1;	//updates number of customer objects
	}
	
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {
		return customers[index];
	}
	
}
