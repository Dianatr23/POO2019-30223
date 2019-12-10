package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.AddBirdFrame;
import views.AddMammalFrame;

public class BirdController extends AbstractController{

	public BirdController(AddBirdFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setOwlButtonActionListener(new OwlButtonActionListener());	
		frame.setFlamingoButtonActionListener(new FlamingoButtonActionListener());	
		frame.setPeacockButtonActionListener(new PeacockButtonActionListener());	
	}
	
	private class PeacockButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class FlamingoButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class OwlButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
}
	

