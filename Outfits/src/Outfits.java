import java.awt.*;
import java.applet.*;


public class Outfits extends Applet{
	
	public void paint(Graphics g) {
		Person person = new Person(g, 70);
		Shirt shirt = new Shirt(g,Color.blue,70);

	}

}
