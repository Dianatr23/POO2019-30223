package views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddMammalFrame extends ZooFrame{
	private JButton btnMonkey;
	private JButton btnCow;
	private JButton btnTiger;
	
	public AddMammalFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnMonkey = new JButton("Monkey");
		slPanel.putConstraint(SpringLayout.NORTH, btnMonkey, 40, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnMonkey, 93, SpringLayout.WEST, panel);
		pan.add(btnMonkey);
		
		btnCow = new JButton("Cow");
		slPanel.putConstraint(SpringLayout.NORTH, btnCow, 80, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnCow, 93, SpringLayout.WEST, panel);
		pan.add(btnCow);
		
		btnTiger = new JButton("Tiger");
		slPanel.putConstraint(SpringLayout.NORTH, btnTiger, 120, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, btnTiger, 93, SpringLayout.WEST, panel);
		pan.add(btnTiger);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
		
	}
	
	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}
	
	public void setMonkeyButtonActionListener(ActionListener a) {
		btnMonkey.addActionListener(a);
	}
	
	public void setCowButtonActionListener(ActionListener a) {
		btnCow.addActionListener(a);
	}
	
	public void setTigerButtonActionListener(ActionListener a) {
		btnTiger.addActionListener(a);
	}
	
	
}
