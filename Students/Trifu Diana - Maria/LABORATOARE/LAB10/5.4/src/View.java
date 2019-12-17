import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
	private Model model;
	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JButton schimb;
	private JComboBox from;
	private JComboBox to; 
	private JTextField in; 
	private JTextField din;
	
	View(Model model){
		
		this.model=model;
		
		frame= new JFrame("CONVERTOR VALUTAR");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1000,1000));
		
		panel1= new JPanel();
		panel2= new JPanel();
		
		from = new JComboBox(model.getStringMonede());
		from.setSize(new Dimension(170,100));
		from.setFont(new Font("Arial",1,30));
		from.setSelectedIndex(2);
		panel1.add(from);
	
		schimb=new JButton(">>");
		schimb.setSize(new Dimension(100, 100));
		schimb.setFont(new Font("Arial",1,19));
		panel1.add(schimb);
		
		to = new JComboBox(model.getStringMonede());
		to.setSize(new Dimension(170,100));
		to.setFont(new Font("Arial",1,30));
		to.setSelectedIndex(2);
		panel1.add(to);
		
		din = new JTextField(10); 
		din.setFont(new Font("Arial",1,20));
		din.setSize(new Dimension(0,30));
		panel2.add(din);
		
		JTextField egal =new JTextField("     =>      ");
		egal.setFont(new Font("Arial",1,20));
		egal.setSize(new Dimension(100,50));
		panel2.add(egal);
		
		in=new JTextField(10);
		in.setFont(new Font("Arial",1,20));
		in.setSize(new Dimension(10,50));
		panel2.add(in);
		
		JPanel mainPanel= new JPanel();
		mainPanel.setLayout(new GridLayout(0,1));
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		
		frame.setContentPane(mainPanel);
		frame.setVisible(true);
		frame.pack();
	}

	public void addSchimbListener(ActionListener action) {
    	this.schimb.addActionListener(action);
    }
	
	public String continutFrom() {
		return (String) this.from.getSelectedItem();
	}
	
	public String continutTo() {
		return (String) this.to.getSelectedItem();
	}
	
	public String getUserInput() { 
		 return din.getText();
	} 
	
	public void putIn(String s) {
		in.removeAll();
		in.setText(s);
		in.add(in);
		in.repaint();
	}
}
