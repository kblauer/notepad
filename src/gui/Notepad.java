package gui;

import javax.swing.SwingUtilities;

public class Notepad {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
            }
        });	
	}

}
