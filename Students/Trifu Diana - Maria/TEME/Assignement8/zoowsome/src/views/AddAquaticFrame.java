package views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddAquaticFrame extends ZooFrame{
	private JButton btnFish;
	private JButton btnDolphin;
	private JButton btnShark;
	
	public AddAquaticFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnDolphin = new JButton("Dolphin");
		slPanel.putConstraint(SpringLayout.NORTH, btnDolphin, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnDolphin, 93, SpringLayout.WEST, pan);
		pan.add(btnDolphin);
		
		btnFish = new JButton("Fish");
		slPanel.putConstraint(SpringLayout.NORTH, btnFish, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnFish, 93, SpringLayout.WEST, pan);
		pan.add(btnFish);
		
		btnShark = new JButton("Shark");
		slPanel.putConstraint(SpringLayout.NORTH, btnShark, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnShark, 93, SpringLayout.WEST, pan);
		pan.add(btnShark);
		
	}
	
	public void setDolphinButtonActionListener(ActionListener a) {
		btnDolphin.addActionListener(a);
	}
	
	public void setFishButtonActionListener(ActionListener a) {
		btnFish.addActionListener(a);
	}
	
	public void setSharkButtonActionListener(ActionListener a) {
		btnShark.addActionListener(a);
	}
	
	
}

