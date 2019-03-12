import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
	JFrame myFrame = new JFrame();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();

	JLabel enter;
	JLabel result;
	JLabel blank;
	JLabel ID;
	JLabel make;
	JLabel model;
	JLabel year;
	JLabel color;
	JLabel price;
	JLabel cond;
	JLabel amt;
	
	JTextField en;
	JTextField r;
	JTextField id;
	JTextField ma;
	JTextField mo;
	JTextField ye;
	JTextField cc;
	JTextField pr;
	JTextField con;
	JTextField am;
	
	JButton search;
	JButton add;
	JButton save;
	
	Inventory stock = new Inventory();
	
	public GUI(){
		stock.readFile();
		
		p1.setLayout(new FlowLayout());
		p1.add(enter = new JLabel("Enter Car Model:"));
		p1.add(en = new JTextField(15));
		p1.add(search = new JButton("Search"));
		p1.add(blank = new JLabel(""));
		
		p2.setLayout(new FlowLayout());
		p2.add(result = new JLabel("Result:"));
		p2.add(r = new JTextField(50));
		
		p3.setLayout(new FlowLayout());
		p3.add(ID = new JLabel("ID: "));
		p3.add(id = new JTextField(15));		
		p3.add(make = new JLabel("Make: "));
		p3.add(ma = new JTextField(15));
		p3.add(model = new JLabel("Model: "));
		p3.add(mo = new JTextField(15));
		p3.add(year = new JLabel("Year: "));
		p3.add(ye = new JTextField(15));
		p3.add(color = new JLabel("Color: "));
		p3.add(cc = new JTextField(15));
		p3.add(price = new JLabel("Price: "));
		p3.add(pr = new JTextField(15));
		p3.add(cond = new JLabel("Condition: "));
		p3.add(con = new JTextField(15));
		p3.add(amt = new JLabel("Amount: "));
		p3.add(am = new JTextField(15));
		p3.add(add = new JButton("Add Car"));
		p3.add(save = new JButton("Save"));
		
		search.addActionListener(this);
		add.addActionListener(this);
		save.addActionListener(this);
		
		myFrame.setLayout(new GridLayout(3, 1));
		myFrame.setSize(740, 300);
		myFrame.setVisible(true);
		myFrame.add(p1);
		myFrame.add(p2);
		myFrame.add(p3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if(str.equals("Add Car")) {
			int i = Integer.parseInt(id.getText().trim());
			String M = ma.getText();
			String m = mo.getText();
			int y = Integer.parseInt(ye.getText());
			String C = cc.getText();
			double p = Double.parseDouble(pr.getText());
			String co = con.getText();
			int a = Integer.parseInt(am.getText());
			
			Car c = new Car(i,M,m,y,C,p,co,a);
			stock.addItem(c);
			
			id.setText("");
			ma.setText("");
			mo.setText("");
			ye.setText("");
			cc.setText("");
			pr.setText("");
			con.setText("");
			am.setText("");
		}
		
		if(str.equals("Search")) {
			System.out.println(stock.getSize());
			int index = stock.findIndexByModel(en.getText());
			r.setText("ID: " + String.valueOf(stock.getID(index)) + "\n" + 
					"Make: " + stock.getMake(index) + "\n" + 
					"Model: " + stock.getModel(index) + "\n" + 
					"Year: " + String.valueOf(stock.getYear(index)) + "\n" + 
					"Color: " + stock.getColor(index) + "\n" + 
					"Price: " + String.valueOf(stock.getPrice(index)) + "\n" + 
					"Condition: " + stock.getCond(index) + "\n" + 
					"Quantity: " + String.valueOf(stock.getAmt(index)));
			}
		
		if(str.equals("Save")) {
			stock.writeData();
		}
		
	}
	
	public static void main(String[] args) {
		new GUI();
	}

}
