package views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddReptileFrame extends ZooFrame{
	private JButton btnLizard;
	private JButton btnSnake;
	private JButton btnTurtle;
	
	public AddReptileFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel(); // adding empty panel to fill grid layout contentPanel.add(panel);
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnSnake = new JButton("Snake");
		slPanel.putConstraint(SpringLayout.NORTH, btnSnake, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnSnake, 93, SpringLayout.WEST, pan);
		pan.add(btnSnake);
		
		btnLizard = new JButton("Lizard");
		slPanel.putConstraint(SpringLayout.NORTH, btnLizard, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnLizard, 93, SpringLayout.WEST, pan);
		pan.add(btnLizard);
		
		btnTurtle = new JButton("Turtle");
		slPanel.putConstraint(SpringLayout.NORTH, btnTurtle, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnTurtle, 93, SpringLayout.WEST, pan);
		pan.add(btnTurtle);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
		
	}
	
	public void setTurtleButtonActionListener(ActionListener a) {
		btnTurtle.addActionListener(a);
	}
	
	public void setLizardButtonActionListener(ActionListener a) {
		btnLizard.addActionListener(a);
	}
	
	public void setSnakeButtonActionListener(ActionListener a) {
		btnSnake.addActionListener(a);
	}
	
	
}


