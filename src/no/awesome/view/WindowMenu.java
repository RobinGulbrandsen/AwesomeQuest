package no.awesome.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import no.awesome.controller.MenuController;

@SuppressWarnings("serial")
public class WindowMenu extends JMenuBar {
	
	public WindowMenu() {
		JMenu file = new JMenu("File");
		
		MenuController menuCtrl = new MenuController();
		
        JMenuItem eMenuItem = new JMenuItem("Exit");
        eMenuItem.addActionListener(menuCtrl);

        file.add(eMenuItem);

        add(file);
	}

}
