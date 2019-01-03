import java.awt.*;

public class Pants {

	private Color pantsColor;

	public Pants(Graphics g, Color cc,int x){
		pantsColor = cc;
		g.setColor(pantsColor);
		g.fillRect(x, 270, 25, 40);
		g.fillRect(x+45, 270, 25, 40);
	}
}