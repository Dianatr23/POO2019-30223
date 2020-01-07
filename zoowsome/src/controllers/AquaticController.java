package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.AddAquaticFrame;

public class AquaticController extends AbstractController{

	public AquaticController(AddAquaticFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setSharkButtonActionListener(new SharkButtonActionListener());	
		frame.setDolphinButtonActionListener(new DolphinButtonActionListener());	
		frame.setFishButtonActionListener(new FishButtonActionListener());	
	}
	
	private class SharkButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class DolphinButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class FishButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
}
	


