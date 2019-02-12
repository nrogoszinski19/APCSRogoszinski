import java.util.*;

public class TestCar {

	public static void main(String[] args) {
		Inventory stock = new Inventory();
		Car c1 = new Car(1, "Nissan", "Altima", 2006, "gold", 6000, "used", 1);
		stock.addItem(c1);
		Car c2 = new Car(2, "Dodge", "Challenger", 2019, "black", 25000, "new", 1);
		stock.addItem(c2);
		
		int index=stock.findIndexByModel("Challenger");
		System.out.println("The " + stock.getMake(index) + " " + stock.getModel(index) + " costs $" + stock.getPrice(index));
	}

}
