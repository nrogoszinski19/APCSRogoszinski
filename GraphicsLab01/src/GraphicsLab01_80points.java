import java.awt.*;
import java.applet.*;

public class GraphicsLab01_80points extends Applet {

	public void paint(Graphics g) {

		g.drawRect(25,25,275,275);
		g.drawRect(100,100,300,300);
		g.drawLine(25, 25, 100, 100);
		g.drawLine(300, 25, 400, 100);
		g.drawLine(25, 300, 100, 400);
		g.drawLine(300, 300, 400, 400);
		
	}

}
