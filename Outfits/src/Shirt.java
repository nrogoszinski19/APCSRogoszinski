import java.awt.*;

public class Shirt{
	
	private Color shirtColor;
	
	public Shirt(Graphics g, Color cc, int x)
	{
		shirtColor = cc;
		g.setColor(shirtColor);
		g.fillRect(x-5, 170, 80, 100);
		g.fillRect(x-40, 170, 40, 20);
		g.fillRect(x+70, 170, 40, 20);
	}
}
