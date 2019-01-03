import java.awt.*;
import java.applet.*;


public class Outfits extends Applet{
	
	public void paint(Graphics g) {
		Person person = new Person(g, 70);
		Shirt shirt = new Shirt(g,Color.red,70);
		//Pants pants = new Pants(g,Color.red,70);
		Pockets pockets = new Pockets(g, 70);
		RippedJeans rips = new RippedJeans(g, 70);

	}

}
