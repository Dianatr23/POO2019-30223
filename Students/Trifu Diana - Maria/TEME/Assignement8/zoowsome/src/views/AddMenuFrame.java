package views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AddMenuFrame extends ZooFrame{
	private JButton btnMammal;
	private JButton btnBird;
	private JButton btnAquatic;
	private JButton btnInsect;
	private JButton btnReptile;
	
	public AddMenuFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnMammal = new JButton("Mammal");
		slPanel.putConstraint(SpringLayout.NORTH, btnMammal, 40, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnMammal, 0, SpringLayout.WEST, pan);
		pan.add(btnMammal);
		
		btnBird = new JButton("Bird");
		slPanel.putConstraint(SpringLayout.NORTH, btnBird, 80, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnBird, 0, SpringLayout.WEST, pan);
		pan.add(btnBird);
		
		btnAquatic = new JButton("Aquatic");
		slPanel.putConstraint(SpringLayout.NORTH, btnAquatic, 120, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAquatic, 0, SpringLayout.WEST, pan);
		pan.add(btnAquatic);
		
		btnInsect = new JButton("Insect");
		slPanel.putConstraint(SpringLayout.NORTH, btnInsect, 160, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST,btnInsect, 0, SpringLayout.WEST, pan);
		pan.add(btnInsect);
		
		btnReptile = new JButton("Reptile");
		slPanel.putConstraint(SpringLayout.NORTH, btnReptile, 200, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnReptile, 0, SpringLayout.WEST, pan);
		pan.add(btnReptile);
		
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

	public void setMammalButtonActionListener(ActionListener a) {
		btnMammal.addActionListener(a);
	}
	
	public void setBirdButtonActionListener(ActionListener a) {
		btnBird.addActionListener(a);
	}
	
	public void setAquaticButtonActionListener(ActionListener a) {
		btnAquatic.addActionListener(a);
	}
	
	public void setReptileButtonActionListener(ActionListener a) {
		btnReptile.addActionListener(a);
	}
	
	public void setInsectButtonActionListener(ActionListener a) {
		btnInsect.addActionListener(a);
	}
}

