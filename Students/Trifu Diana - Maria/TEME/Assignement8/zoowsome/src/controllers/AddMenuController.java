package controllers;

import views.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMenuController extends AbstractController{

	public AddMenuController(AddMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setMammalButtonActionListener(new MammalButtonActionListener());	
		frame.setBirdButtonActionListener(new BirdButtonActionListener());	
		frame.setInsectButtonActionListener(new InsectButtonActionListener());	
		frame.setReptileButtonActionListener(new ReptileButtonActionListener());	
		frame.setAquaticButtonActionListener(new AquaticButtonActionListener());	
	}

	private class MammalButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new MammalController(new AddMammalFrame("Mammal"), true);
		}

	}

	private class BirdButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new BirdController(new AddBirdFrame("Bird"), true);
		}

	}
	private class ReptileButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new ReptileController(new AddReptileFrame("Reptile"), true);
		}

	}
	private class AquaticButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AquaticController((new AddAquaticFrame("Aquatic")), true);
		}

	}
	private class InsectButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new InsectController((new AddInsectFrame("Insect")), true);
		}

	}

}
