import java.awt.*;

public class Pockets extends Pants{

	private int x;

	public Pockets(Graphics g,int x1){
		super(g,Color.blue,x1);
		x = x1;
		g.setColor(Color.gray);
		g.fillRect(x, 270, 12, 12);
		g.fillRect(x + 58, 270, 12, 12);
	}
}