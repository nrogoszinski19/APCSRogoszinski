import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusFahrenheit implements ActionListener {
//make these accessible to the entire code
	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JTextField cels;
	JLabel fahr;
	
	public CelsiusFahrenheit(){
		myPanel.setLayout(new GridLayout(2, 2));	// 2x2 grid
		
		cels = new JTextField("celsius");			//text box
		JButton convert = new JButton("Convert");	//button
		fahr = new JLabel("fahrenheit");			//text
		
		convert.addActionListener(this);			//this object is going to make something happen
		
		//add to the panel
		myPanel.add(cels);
		myPanel.add(convert);
		myPanel.add(fahr);
		
		//setting frame
		myFrame.add(myPanel);
		myFrame.setTitle("Convert Celsius to Fahrenheit");
		myFrame.setSize(400, 200);
		myFrame.setVisible(true);
	}
	//required!!
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("Convert")) {
			double celsius = Double.parseDouble(cels.getText());
			double convert = celsius*(9/5) + 32;
			
			fahr.setText(convert + " fahrenheit");
		}
	}

	public static void main(String args[]) {
		new CelsiusFahrenheit();
	}

}
