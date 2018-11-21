
public class Pumpkin {
	private double weight;
	private double pricePerPound = .25;
	
public Pumpkin(double pounds){
	weight = pounds;
}

public void setWeight(double w){
	if(w < 1000)
		weight = w;
}

public double getWeight(){
	return weight;
}

public double getPrice() {
	return pricePerPound;
}

public double getTotal() {
	return weight*pricePerPound;
}

public void grow() {
	weight = weight + .5;
}

}
