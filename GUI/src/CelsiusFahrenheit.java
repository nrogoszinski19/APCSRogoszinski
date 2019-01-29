import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusFahrenheit implements ActionListener {

	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JTextField cels;
	JLabel fahr;
	
	public CelsiusFahrenheit(){
		myPanel.setLayout(new GridLayout(2, 2));
		
		cels = new JTextField("celsius");
		JButton convert = new JButton("Convert");
		fahr = new JLabel("fahrenheit");
		
		convert.addActionListener(this);
		
		myPanel.add(cels);
		myPanel.add(convert);
		myPanel.add(fahr);
		
		myFrame.add(myPanel);
		myFrame.setTitle("Convert Celsius to Fahrenheit");
		myFrame.setSize(400, 200);
		myFrame.setVisible(true);
	}
	
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
