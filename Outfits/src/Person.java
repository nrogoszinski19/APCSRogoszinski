import java.awt.*;

public class Person {
	
	public Person(Graphics g, int x) {
		g.setColor(Color.black);
		g.fillOval(x, 100, 70, 70);
		g.fillRect(x-5, 170, 80, 100);
		g.fillOval(x, 255, 25, 65);
		g.fillOval(x+45, 255, 25, 65);
		g.fillOval(x-60, 170, 80, 20);
		g.fillOval(x+50, 170, 80, 20);
	}

}
