import java.awt.*;

public class Locomotive extends TrainCar{
			
		private int x;
		
		public Locomotive(Graphics g, int x1){
			super(g,Color.blue,x1);
			x = x1;
			drawFront(g);
			drawTop(g);
			
		}	
		
		public void drawFront(Graphics g){
		    Polygon front = new Polygon();
		    front.addPoint(x, 350);
		    front.addPoint(x-50, 350);
		    front.addPoint(x, 300);
		    g.setColor(Color.black);
		    g.fillPolygon(front);
		}
		
		public void drawTop(Graphics g) {
			Polygon top = new Polygon();
			top.addPoint(x+20, 250);
			top.addPoint(x+20, 220);
			top.addPoint(x, 200);
			top.addPoint(x, 190);
			top.addPoint(x+60, 190);
			top.addPoint(x+60, 200);
			top.addPoint(x+40, 220);
			top.addPoint(x+40, 250);
			g.setColor(Color.black);
			g.fillPolygon(top);
			g.setColor(Color.gray);
			g.fillOval(x+30,160,30,30);
			g.fillOval(x,160,30,30);
			g.fillOval(x+10,140,30,30);
			g.fillOval(x+20,120,30,30);
			g.fillOval(x+10,90,30,30);
		}
		

}
