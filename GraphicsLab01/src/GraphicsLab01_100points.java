import java.awt.*;
import java.applet.*;

public class GraphicsLab01_100points extends Applet {

	public void paint(Graphics g) {
		
		g.drawRect(25,25,275,275);
		g.drawRect(100,100,300,300);
		g.drawLine(25, 25, 100, 100);
		g.drawLine(300, 25, 400, 100);
		g.drawLine(25, 300, 100, 400);
		g.drawLine(300, 300, 400, 400);
		
		g.drawOval(600, 25, 300, 300);
		g.drawOval(600, 65, 300, 225);
		g.drawOval(600, 105, 300, 150);
		g.drawOval(600, 145, 300, 75);
		g.drawOval(640, 25, 225, 300);
		g.drawOval(680, 25, 150, 300);
		g.drawOval(720, 25, 75, 300);
		
		g.drawLine(550, 350, 400, 650);
		g.drawLine(550, 350, 700, 650);
		g.drawLine(400, 650, 700, 650);
		g.drawLine(550, 350, 550, 600);
		g.drawLine(400, 650, 550, 600);
		g.drawLine(700, 650, 550, 600);
		

	}

}
