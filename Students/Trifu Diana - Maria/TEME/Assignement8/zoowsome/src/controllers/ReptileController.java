package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.AddReptileFrame;

public class ReptileController extends AbstractController{

	public ReptileController(AddReptileFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setTurtleButtonActionListener(new TurtleButtonActionListener());	
		frame.setLizardButtonActionListener(new LizardButtonActionListener());	
		frame.setSnakeButtonActionListener(new SnakeButtonActionListener());	
	}
	
	private class TurtleButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class SnakeButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class LizardButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
}
	

