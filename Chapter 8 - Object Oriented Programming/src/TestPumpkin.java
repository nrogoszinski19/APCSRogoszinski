
public class TestPumpkin {

	public static void main(String[] args) {
		
		
		Pumpkin skinnyPumpkin = new Pumpkin(5);
		Pumpkin averagePumpkin = new Pumpkin(10);
		Pumpkin fatPumpkin = new Pumpkin(15);
		
		System.out.println("total Pumpkin weight is " + (skinnyPumpkin.getWeight() + averagePumpkin.getWeight() + fatPumpkin.getWeight()));
		System.out.println("total Pumpkin price is " + (skinnyPumpkin.getTotal() + averagePumpkin.getTotal() + fatPumpkin.getTotal()));
		System.out.println();
		System.out.println("first Pumpkin's weight is " + skinnyPumpkin.getWeight());
		System.out.println("first Pumpkin's price is " + skinnyPumpkin.getTotal());
		System.out.println();
		System.out.println("second Pumpkin's weight is " + averagePumpkin.getWeight());
		System.out.println("second Pumpkin's price is " + averagePumpkin.getTotal());
		System.out.println();
		System.out.println("third Pumpkin's weight is " + fatPumpkin.getWeight());
		System.out.println("third Pumpkin's price is " + fatPumpkin.getTotal());

		for(int i=1; i<=5; i++) {
			skinnyPumpkin.grow();
			averagePumpkin.grow();
			fatPumpkin.grow();
		}
		
		System.out.println();System.out.println();
		System.out.println("total Pumpkin weight is " + (skinnyPumpkin.getWeight() + averagePumpkin.getWeight() + fatPumpkin.getWeight()));
		System.out.println("total Pumpkin price is " + (skinnyPumpkin.getTotal() + averagePumpkin.getTotal() + fatPumpkin.getTotal()));
		System.out.println();
		System.out.println("first Pumpkin's weight is " + skinnyPumpkin.getWeight());
		System.out.println("first Pumpkin's price is " + skinnyPumpkin.getTotal());
		System.out.println();
		System.out.println("second Pumpkin's weight is " + averagePumpkin.getWeight());
		System.out.println("second Pumpkin's price is " + averagePumpkin.getTotal());
		System.out.println();
		System.out.println("third Pumpkin's weight is " + fatPumpkin.getWeight());
		System.out.println("third Pumpkin's price is " + fatPumpkin.getTotal());
	}

}
