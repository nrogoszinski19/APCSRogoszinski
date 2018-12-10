import java.awt.*;

public class PassengerCar extends TrainCar {
	
	private int x;
	
	public PassengerCar(Graphics g, int x1){
		super(g,Color.black,x1);
		x = x1;
		drawWindows(g);
		drawPassengers(g);
	}
	
	public void drawWindows(Graphics g){
	    g.setColor(Color.white);
		g.fillRect(x+30,280,90,30);
	}
	
	public void drawPassengers(Graphics g) {
		g.setColor(Color.blue);
		g.fillOval(x+30, 285, 25, 25);
		g.setColor(Color.yellow);
		g.fillOval(x+60, 285, 25, 25);
		g.setColor(Color.orange);
		g.fillOval(x+90, 285, 25, 25);
	}
}
