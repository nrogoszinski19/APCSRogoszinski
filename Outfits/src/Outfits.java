import java.awt.*;
import java.applet.*;

public class Outfits extends Applet{
	
	public void paint(Graphics g) {
		Person person1 = new Person(g, 70);
		Shirt shirt1 = new Shirt(g,Color.red,70);
		RippedJeans rips1 = new RippedJeans(g, 70);
		
		Person person2 = new Person(g, 270);
		Shirt shirt2 = new Shirt(g,Color.orange,270);
		Pants pants2 = new Pants(g,Color.blue,270);
		Pockets pockets2 = new Pockets(g, 270);

	}
}