import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//type of JFrame
//Step 1: implements ActionListener.
public class ButtonExample implements ActionListener {
	
	JFrame myFrame = new JFrame();  //outer shell frame
	JPanel myPanel = new JPanel();  //3 buttons
	
	public ButtonExample() {
		
		myPanel.setLayout(new FlowLayout());//sets how the buttons are placed

		//creating buttons
		JButton rb = new JButton("Red");
		JButton gb = new JButton("Green");
		JButton pr = new JButton("Purple");

		//add your buttons to the Action Listener.
		rb.addActionListener(this);
		gb.addActionListener(this);
		pr.addActionListener(this);

		//add your buttons to the panel.
		myPanel.add(rb);
		myPanel.add(gb);
		myPanel.add(pr);

		//add your panel to the frame.
		myFrame.add(myPanel);
		myFrame.setTitle("Button in Action");
		myFrame.setSize(400, 400);
		myFrame.setVisible(true);
	}

	//Implement your reaction for each button.
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();   //grabbing the string name of the button
		
		System.out.println("You clicked " + str + " button");

		if (str.equals("Red")) {
			myPanel.setBackground(Color.red);
		} else if (str.equals("Green")) {
			myPanel.setBackground(Color.green);
		}
		else if (str.equals("Purple")) {
			myPanel.setBackground(Color.magenta);
		}
	}

	public static void main(String args[]) {
		new ButtonExample();
	}
}
