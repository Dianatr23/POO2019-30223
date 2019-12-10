package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.AddMammalFrame;

public class MammalController extends AbstractController{

	public MammalController(AddMammalFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setTigerButtonActionListener(new TigerButtonActionListener());	
		frame.setCowButtonActionListener(new CowButtonActionListener());	
		frame.setMonkeyButtonActionListener(new MonkeyButtonActionListener());	
	}
	
	private class TigerButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class CowButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
	
	private class MonkeyButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
}
	

