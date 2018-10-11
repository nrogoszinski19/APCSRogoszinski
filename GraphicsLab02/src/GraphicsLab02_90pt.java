import java.awt.*;
import java.applet.*;

public class GraphicsLab02_90pt extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		
		int a1 = 990;
		int b1 = 10;
		int c1 = 990;
		int d1 = 640;
		for (int i=0; i<62; i++) {
			b1 = b1 + 10;
			c1 = c1 - 16;
			g.drawLine(a1,b1,c1,d1);
		}
		
		int a2 = 10;
		int b2 = 10;
		int c2 = 10;
		int d2 = 640;
		for (int i=0; i<62; i++) {
			b2 = b2 + 10;
			c2 = c2 + 16;
			g.drawLine(a2,b2,c2,d2);
		}
		
	}
	
}
