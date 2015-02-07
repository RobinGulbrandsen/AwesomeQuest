package no.awesome.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = e.getActionCommand();
		
		switch (text) {
		case "Exit":
			exitProgram();
			break;
		default:
			break;
		}
	}
	
	private void exitProgram() {
		System.exit(0);
	}

}
