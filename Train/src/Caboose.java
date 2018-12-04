import java.awt.Color;
import java.awt.Graphics;

public class Caboose extends TrainCar{
	
	private int x;
	
	public Caboose(Graphics g, int x1){
		super(g,Color.red,x1);
		x = x1;
		drawWindows(g);
		drawTop(g);
		drawTippyTop(g);
	}
	
	public void drawWindows(Graphics g){
	    g.setColor(Color.white);
	    g.fillRect(x+30,280,30,30);
	    g.fillRect(x+90,280,30,30);
	}
	
	public void drawTop(Graphics g){
	    g.setColor(Color.red);
	    g.fillRect(x+50,240,60,10);
	}
	
	public void drawTippyTop(Graphics g){
	    g.setColor(Color.black);
	    g.fillRect(x+40,235,80,5);
	}
	
}
