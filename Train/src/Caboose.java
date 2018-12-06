import java.awt.*;

public class Caboose extends TrainCar{
	
	private int x;
	
	public Caboose(Graphics g, int x1){
		super(g,Color.red,x1);
		x = x1;
		drawWindows(g);
		drawCoal(g);
	}
	
	public void drawWindows(Graphics g){
	    g.setColor(Color.white);
	    g.fillRect(x+30,280,30,30);
	    g.fillRect(x+90,280,30,30);
	}
	
	public void drawCoal(Graphics g) {
		Polygon coal = new Polygon();
		coal.addPoint(x, 250);
		coal.addPoint(x+30, 230);
		coal.addPoint(x+30, 210);
		coal.addPoint(x+60, 210);
		coal.addPoint(x+75, 200);
		coal.addPoint(x+100, 210);
		coal.addPoint(x+120, 220);
		coal.addPoint(x+120, 230);
		coal.addPoint(x+150, 250);
		g.setColor(Color.black);
		g.fillPolygon(coal);
	}
}
