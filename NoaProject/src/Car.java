
public class Car {
	private int id;
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;
	private String condition;
	private int amount;

	public Car(int _id, String _make, String _model, int _year, String _color, double _price, String cond, int amt){
		id = _id;
		make = _make;
		model = _model;
		year = _year;
		color = _color;
		price = _price;
		condition = cond;
		amount = amt;
	}
	
	public int getID() {
		return id;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCond() {
		return condition;
	}
	
	public int getAmt() {
		return amount;
	}
	

}
