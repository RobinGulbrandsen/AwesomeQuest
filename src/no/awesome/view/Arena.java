package no.awesome.view;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Arena extends JFrame {

	public Arena() {
		super("Arena");
		
        setJMenuBar(new WindowMenu());
		
		setLocationRelativeTo(null);
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Arena();
	}
	
}
