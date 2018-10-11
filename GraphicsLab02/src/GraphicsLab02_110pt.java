import java.awt.*;
import java.applet.*;

public class GraphicsLab02_110pt extends Applet
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
	
	// illusion within illusion
		
		int width2 = 480;
		int height2 = 310;
		g.drawRect(260,170,width2,height2);
		
		int a5 = 740;
		int b5 = 170;
		int c5 = 740;
		int d5 = 480;
		for (int i=0; i<30; i++) {
			b5 = b5 + 10;
			c5 = c5 - 7;
			g.drawLine(a5,b5,c5,d5);
		}
		
		int a6 = 260;
		int b6 = 170;
		int c6 = 260;
		int d6 = 480;
		for (int i=0; i<30; i++) {
			b6 = b6 + 10;
			c6 = c6 + 7;
			g.drawLine(a6,b6,c6,d6);
		}
		
		int a7 = 260;
		int b7 = 480;
		int c7 = 260;
		int d7 = 170;
		for (int i=0; i<30; i++) {
			b7 = b7 - 10;
			c7 = c7 + 7;
			g.drawLine(a7,b7,c7,d7);
		}
		
		int a8 = 740;
		int b8 = 480;
		int c8 = 740;
		int d8 = 170;
		for (int i=0; i<30; i++) {
			b8 = b8 - 10;
			c8 = c8 - 7;
			g.drawLine(a8,b8,c8,d8);
		}
		
	}
	
}
