import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Creator {
	
	JFrame frame = new JFrame("My Simple Calculator");
	JTextField txt1;
	JTextField txt2;
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JLabel label;
	
	public Creator(){
		createFrame();
		textFields();
		buttons();
		label();
		frame.pack();
	}
	
	public void createFrame(){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane();
		frame.setVisible(true);
		frame.setSize(400, 200);
	}
	
	public void buttons(){
		JPanel buttonPan = new JPanel();
		add = new JButton("Add");
		subtract = new JButton("Subtract");
		divide = new JButton("Divide");
		multiply= new JButton("Multiply");
		buttonPan.add(add);
		buttonPan.add(subtract);
		buttonPan.add(multiply);
		buttonPan.add(divide);
		
		frame.add(buttonPan, BorderLayout.SOUTH);
	}
	
	public void textFields(){
		JPanel text = new JPanel();
		text.setBounds(0,0,105,20);
		txt1 = new JTextField(10);
		txt2 = new JTextField(10);
		text.add(txt1);
		text.add(txt2);
		frame.add(text, BorderLayout.NORTH);
	}
	
	public void label(){
		label = new JLabel("Result  =  ");
		JPanel ans = new JPanel();
		ans.add(label);
		frame.add(ans, BorderLayout.WEST);
	}
}
