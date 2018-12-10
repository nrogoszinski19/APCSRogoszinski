
import java.awt.*;
import java.applet.*;


public class MyTrain extends Applet{
	
	public void paint(Graphics g)
	{
		Locomotive loc = new Locomotive(g,70);
		TrainCar tc2 = new TrainCar(g,Color.green,240);
		TrainCar tc3 = new TrainCar(g,Color.yellow,410);
		PassengerCar pas = new PassengerCar(g,580);
		TrainCar tc4 = new TrainCar(g,Color.orange,750);
		TrainCar tc5 = new TrainCar(g,Color.magenta,920);	
		Caboose cab = new Caboose(g,1090);
	}

}
