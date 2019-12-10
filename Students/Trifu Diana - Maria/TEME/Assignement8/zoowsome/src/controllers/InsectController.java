package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.AddInsectFrame;
import views.AddMammalFrame;

public class InsectController extends AbstractController{

	public InsectController(AddInsectFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setSpiderButtonActionListener(new SpiderButtonActionListener());	
		frame.setCockroachButtonActionListener(new CockroachButtonActionListener());	
		frame.setButterflyButtonActionListener(new ButterflyButtonActionListener());	
	}
	
	private class SpiderButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class ButterflyButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class CockroachButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
}
	

