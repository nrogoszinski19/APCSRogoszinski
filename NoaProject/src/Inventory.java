import java.io.FileWriter;
import java.util.ArrayList;

public class Inventory {
	
	ArrayList<Car> products;
	
	public Inventory() {
		products = new ArrayList<Car>();
	}

	public void addItem(Car c) {
		products.add(c);
	}
	public void removeItem(Car c) {
		products.remove(c);
	}
	public int findIndexByModel(String model) {
		for(int i=0; i<=products.size(); i++) {
			if((products.get(i).getModel()).equals(model))
				return i;
		}
		return -1;
	}
	
	public int getID(int index) {
		return products.get(index).getID();
	}
	
	public String getMake(int index) {
		return products.get(index).getMake();
	}
	
	public String getModel(int index) {
		return products.get(index).getModel();
	}
	
	public int getYear(int index) {
		return products.get(index).getYear();
	}
	
	public String getColor(int index) {
		return products.get(index).getColor();
	}
	
	public double getPrice(int index) {
		return products.get(index).getPrice();
	}
	
	public String getCond(int index) {
		return products.get(index).getCond();
	}
	
	public int getAmt(int index) {
		return products.get(index).getAmt();
	}
	

	public void writeData() {
		try {
			FileWriter f = new FileWriter("out.txt");
			for(Car it : products) {
				f.write(it.getID() + " " + it.getMake() + " "  + it.getModel() + " "  + it.getColor() + " "  + it.getPrice() + " "  + it.getCond() + " "  + it.getAmt() + "\n");
			}
			f.close();
		}catch(Exception error) {
			System.out.println("There was an error")
;		}
	}

}
