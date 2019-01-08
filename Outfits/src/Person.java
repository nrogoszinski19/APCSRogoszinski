import java.awt.*;

public class Person {
	
	public Person(Graphics g, int x) {
		g.setColor(Color.black);
		//head
		g.fillOval(x, 100, 70, 70);
		//body
		g.fillRect(x-5, 170, 80, 100);
		//legs
		g.fillOval(x, 255, 25, 65);
		g.fillOval(x+45, 255, 25, 65);
		//arms
		g.fillOval(x-60, 170, 80, 20);
		g.fillOval(x+50, 170, 80, 20);
		//eyes
		g.setColor(Color.white);
		g.fillOval(x+10, 130, 10, 10);
		g.fillOval(x+50, 130, 10, 10);
	}

}
