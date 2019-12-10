package views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddInsectFrame extends ZooFrame{
	private JButton btnCockroach;
	private JButton btnButterfly;
	private JButton btnSpider;
	
	public AddInsectFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnCockroach = new JButton("Cockroach");
		slPanel.putConstraint(SpringLayout.NORTH, btnCockroach, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnCockroach, 93, SpringLayout.WEST, pan);
		pan.add(btnCockroach);
		
		btnButterfly = new JButton("Butterfly");
		slPanel.putConstraint(SpringLayout.NORTH, btnButterfly, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnButterfly, 93, SpringLayout.WEST, pan);
		pan.add(btnButterfly);
		
		btnSpider = new JButton("Spider");
		slPanel.putConstraint(SpringLayout.NORTH, btnSpider, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnSpider, 93, SpringLayout.WEST, pan);
		pan.add(btnSpider);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
		
	}
	
	public void setSpiderButtonActionListener(ActionListener a) {
		btnSpider.addActionListener(a);
	}
	
	public void setButterflyButtonActionListener(ActionListener a) {
		btnButterfly.addActionListener(a);
	}
	
	public void setCockroachButtonActionListener(ActionListener a) {
		btnCockroach.addActionListener(a);
	}
	
	
}



