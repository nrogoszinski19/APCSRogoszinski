import java.awt.*;

public class RippedJeans extends Pants {

	private int x;

	public RippedJeans(Graphics g,int x2){
		super(g,Color.blue,x2);
		x=x2;
		g.setColor(Color.black);
	    g.drawLine(x+1, 290, x+24, 300);
		g.drawLine(x+24, 300, x+12, 271);
		g.drawLine(x+24, 270, x+1, 309);
		g.drawLine(x+46, 271, x+69, 309);
		g.drawLine(x+69, 290, x+46, 300);
		g.drawLine(x+69, 271, x+46, 300);
	}
}