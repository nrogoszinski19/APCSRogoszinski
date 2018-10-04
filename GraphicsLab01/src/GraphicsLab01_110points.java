import java.awt.*;
import java.applet.*;

public class GraphicsLab01_110points extends Applet {

	public void paint(Graphics g) {
		
		g.drawRect(25,25,275,275);
		g.drawRect(100,100,300,300);
		g.drawLine(25, 25, 100, 100);
		g.drawLine(300, 25, 400, 100);
		g.drawLine(25, 300, 100, 400);
		g.drawLine(300, 300, 400, 400);
		
		g.drawOval(50, 50, 300, 300);
		g.drawOval(50, 90, 300, 225);
		g.drawOval(50, 130, 300, 150);
		g.drawOval(50, 170, 300, 75);
		g.drawOval(90, 50, 225, 300);
		g.drawOval(130, 50, 150, 300);
		g.drawOval(170, 50, 75, 300);
		
		g.drawLine(550, 350, 400, 650);
		g.drawLine(550, 350, 700, 650);
		g.drawLine(400, 650, 700, 650);
		g.drawLine(550, 350, 550, 600);
		g.drawLine(400, 650, 550, 600);
		g.drawLine(700, 650, 550, 600);

	}

}
