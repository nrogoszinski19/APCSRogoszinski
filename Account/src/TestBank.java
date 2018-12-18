
public class TestBank {

	public static void main(String[] args) {
		
		Bank piggyBank = new Bank();
		
		piggyBank.addCustomer("Jane", "Simms", 100);
		piggyBank.addCustomer("Owen", "Bryant", 5);
		piggyBank.addCustomer("Tim", "Soley", 2);
		piggyBank.addCustomer("Maria", "Soley", 4);
		
		for(int i=0; i<piggyBank.getNumOfCustomers(); i++) {
			System.out.println("Customer [" + i + "] is " + piggyBank.getCustomer(i).getLast() + ", " + piggyBank.getCustomer(i).getFirst() + " and has balance " + piggyBank.getCustomer(i).getAccount().getBalance());
		}
		
	}

}
