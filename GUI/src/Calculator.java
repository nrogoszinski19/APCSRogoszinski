import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
	JFrame myFrame = new JFrame();
	
	JTextField result;
	JButton num1;
	JButton num2;
	JButton num3;
	JButton num4;
	JButton num5;
	JButton num6;
	JButton num7;
	JButton num8;
	JButton num9;
	JButton num0;
	JButton equal;
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JButton clear;
	double shown;
	double solveShown;
	boolean addBool = false;
	boolean subBool = false;
	boolean multBool = false;
	boolean divBool = false;
	
	public Calculator() {
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(result = new JTextField(" ", 20));
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(4, 4));
		p2.add(num1 = new JButton("1"));
		p2.add(num2 = new JButton("2"));
		p2.add(num3 = new JButton("3"));
		p2.add(add = new JButton("+"));
		p2.add(num4 = new JButton("4"));
		p2.add(num5 = new JButton("5"));
		p2.add(num6 = new JButton("6"));
		p2.add(subtract = new JButton("-"));
		p2.add(num7 = new JButton("7"));
		p2.add(num8 = new JButton("8"));
		p2.add(num9 = new JButton("9"));
		p2.add(multiply = new JButton("*"));
		p2.add(new JLabel(" "));
		p2.add(num0 = new JButton("0"));
		p2.add(divide = new JButton("/"));
		p2.add(equal = new JButton("="));
		

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 1));
        p3.add(clear = new JButton("Clear"));
        
        num1.addActionListener(this);
        num2.addActionListener(this);
        num3.addActionListener(this);
        num4.addActionListener(this);
        num5.addActionListener(this);
        num6.addActionListener(this);
        num7.addActionListener(this);
        num8.addActionListener(this);
        num9.addActionListener(this);
        num0.addActionListener(this);
        equal.addActionListener(this);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        clear.addActionListener(this);
        
        myFrame.setLayout(new GridLayout(3, 1));
		myFrame.setSize(300, 400);
		myFrame.setVisible(true);
		myFrame.add(p1);
		myFrame.add(p2);
		myFrame.add(p3);
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		//numbers
		if(str.equals("1")) {
			result.setText(result.getText() + "1");
		}
		if(str.equals("2")) {
			result.setText(result.getText() + "2");
		}
		if(str.equals("3")) {
			result.setText(result.getText() + "3");
		}
		if(str.equals("4")) {
			result.setText(result.getText() + "4");
		}
		if(str.equals("5")) {
			result.setText(result.getText() + "5");
		}
		if(str.equals("6")) {
			result.setText(result.getText() + "6");
		}
		if(str.equals("7")) {
			result.setText(result.getText() + "7");
		}
		if(str.equals("8")) {
			result.setText(result.getText() + "8");
		}
		if(str.equals("9")) {
			result.setText(result.getText() + "9");
		}
		if(str.equals("0")) {
			result.setText(result.getText() + "0");
		}
		
		//operations
		if(str.equals("+")) {
			shown = Double.parseDouble(result.getText());
            result.setText("");
            addBool = true;
		}
		if(str.equals("-")) {
			shown = Double.parseDouble(result.getText());
            result.setText("");
            subBool = true;
		}
		if(str.equals("*")) {
			shown = Double.parseDouble(result.getText());
            result.setText("");
            multBool = true;
		}
		if(str.equals("/")) {
			shown = Double.parseDouble(result.getText());
            result.setText("");
            divBool = true;
		}
		if(str.equals("=")) {
			solveShown = Double.parseDouble(result.getText());
            if (addBool == true)
                solveShown = solveShown + shown;
            else if ( subBool == true)
                solveShown = solveShown - shown;
            else if ( multBool == true)
                solveShown = solveShown * shown;
            else if ( divBool == true)
                solveShown = solveShown / shown;
            result.setText(Double.toString(solveShown));

            addBool = false;
            subBool = false;
            multBool = false;
            divBool = false;
		}
		
		if(str.equals("Clear")) {
			result.setText("");
		}
	}

	public static void main(String[] args) {
		new Calculator();
		
	}

}
