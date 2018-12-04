import java.awt.Color;
import java.awt.Graphics;

public class Locomotive extends TrainCar{
			
		private int x;
		
		public Locomotive(Graphics g, int x1){
			super(g,Color.blue,x1);
			x = x1;
			drawFront(g);
			
		}	
		
		public void drawFront(Graphics g){
		    g.setColor(Color.black);
		    g.drawLine(x, 350, x-30, 350);
		    g.drawLine(x, 350, x, 310);
		    g.drawLine(x-30, 350, x, 310);
		}
		

}
