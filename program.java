import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class program implements ActionListener{
Creator exec;
	public program (){
		exec = new Creator();
		exec.add.addActionListener(this);
		exec.subtract.addActionListener(this);
		exec.multiply.addActionListener(this);
		exec.divide.addActionListener(this);
	}
	public double parse(JTextField val){
		try{
			if (val.getText().equals(""))
				return 0;
			else{
			Double db = Double.parseDouble(val.getText());
			return db;
			}
		}
		catch(NumberFormatException e)
		{
			throw e;
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		double ans = 0.0;
		if (e.getSource().equals(exec.add))
			ans = add();
		else if (e.getSource().equals(exec.subtract))
			ans = subtract();
		else if (e.getSource().equals(exec.multiply))
			ans = multiply();
		else if (e.getSource().equals(exec.divide)){
			ans = divide();
			if (ans == (double)2/0){
				exec.label.setText("Result = Error");
				return;
			}
		}
		exec.label.setText("Result = "+ans);
	}
	
	public double add(){
		Double val1 = parse(exec.txt1);
		Double val2 = parse(exec.txt2);
		return val1+val2;
	}
	
	public double subtract(){
		Double val1 = parse(exec.txt1);
		Double val2 = parse(exec.txt2);
		return val1-val2;
	}
	
	public double multiply(){
		Double val1 = parse(exec.txt1);
		Double val2 = parse(exec.txt2);
		return val1*val2;
	}
	
	public double divide(){
		ArithmeticException e = new ArithmeticException();
		Double val1 = parse(exec.txt1);
		Double val2 = parse(exec.txt2);
		if (val2 == 0)
			throw e;
		else
		return val1/val2;
	}
}
