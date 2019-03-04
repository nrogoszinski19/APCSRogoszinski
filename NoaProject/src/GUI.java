import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
	JFrame myFrame = new JFrame();
	JTextField info;
	JLabel blank;
	JLabel enter;
	JLabel result;
	JLabel id;
	JLabel make;
	JLabel model;
	JLabel year;
	JLabel color;
	JLabel price;
	JLabel cond;
	JLabel amt;
	JTextField e;
	JTextField r;
	JTextField i;
	JTextField ma;
	JTextField mo;
	JTextField y;
	JTextField cc;
	JTextField p;
	JTextField c;
	JTextField a;
	JButton search;
	JButton add;
	JButton rem;
	int index;
	Inventory stock = new Inventory();
	
	public GUI(){
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,1));
		p1.add(enter = new JLabel("Enter Car Model:"));
		p1.add(e = new JTextField(" ", 15));
		p1.add(search = new JButton("Search"));
		p1.add(blank = new JLabel(" "));
		p1.add(result = new JLabel("Result:"));
		p1.add(r = new JTextField(" ", 15));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(9,2));
		p2.add(id = new JLabel("ID: "));
		p2.add(i = new JTextField(" ", 15));
		p2.add(make = new JLabel("Make: "));
		p2.add(ma = new JTextField(" ", 15));
		p2.add(model = new JLabel("Model: "));
		p2.add(mo = new JTextField(" "));
		p2.add(year = new JLabel("Year: "));
		p2.add(y = new JTextField(" "));
		p2.add(color = new JLabel("Color: "));
		p2.add(cc = new JTextField(" ", 15));
		p2.add(price = new JLabel("Price: "));
		p2.add(p = new JTextField(" ", 15));
		p2.add(cond = new JLabel("Condition: "));
		p2.add(c = new JTextField(" ", 15));
		p2.add(amt = new JLabel("Amount: "));
		p2.add(a = new JTextField(" ", 15));
		p2.add(add = new JButton("Add Car"));
		p2.add(rem = new JButton("Remove Car"));
		
		search.addActionListener(this);
		add.addActionListener(this);
		rem.addActionListener(this);
		
		myFrame.setLayout(new GridLayout(1, 2));
		myFrame.setSize(1000, 400);
		myFrame.setVisible(true);
		myFrame.add(p1);
		myFrame.add(p2);
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("Add Car")) {
			
		}
		
		if(str.equals("Remove Car")) {
			
		}
		if(str.equals("Search")) {
			index = stock.findIndexByModel(e.getText());
			r.setText(readFile(index));
		}	
	}
	
	public static void main(String[] args) {
		new GUI();
	}

}
