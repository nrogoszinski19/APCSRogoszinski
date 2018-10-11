import java.awt.*;
import java.applet.*;

public class GraphicsLab02_100pt extends Applet
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
		
		int a3 = 10;
		int b3 = 640;
		int c3 = 10;
		int d3 = 10;
		for (int i=0; i<62; i++) {
			b3 = b3 - 10;
			c3 = c3 + 16;
			g.drawLine(a3,b3,c3,d3);
		}
		
		int a4 = 990;
		int b4 = 640;
		int c4 = 990;
		int d4 = 10;
		for (int i=0; i<62; i++) {
			b4 = b4 - 10;
			c4 = c4 - 16;
			g.drawLine(a4,b4,c4,d4);
		}
		
	}
	
}
