package views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddBirdFrame extends ZooFrame{
	private JButton btnOwl;
	private JButton btnFlamingo;
	private JButton btnPeacock;
	
	public AddBirdFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnOwl = new JButton("Owl");
		slPanel.putConstraint(SpringLayout.NORTH, btnOwl, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnOwl, 93, SpringLayout.WEST, pan);
		pan.add(btnOwl);
		
		btnPeacock = new JButton("Peacock");
		slPanel.putConstraint(SpringLayout.NORTH, btnPeacock, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnPeacock, 93, SpringLayout.WEST, pan);
		pan.add(btnPeacock);
		
		btnFlamingo = new JButton("Flamingo");
		slPanel.putConstraint(SpringLayout.NORTH, btnFlamingo, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnFlamingo, 93, SpringLayout.WEST, pan);
		pan.add(btnFlamingo);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
		
	}
	
	public void setOwlButtonActionListener(ActionListener a) {
		btnOwl.addActionListener(a);
	}
	
	public void setFlamingoButtonActionListener(ActionListener a) {
		btnFlamingo.addActionListener(a);
	}
	
	public void setPeacockButtonActionListener(ActionListener a) {
		btnPeacock.addActionListener(a);
	}
	
	
}

