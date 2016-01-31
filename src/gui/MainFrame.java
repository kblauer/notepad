package gui;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	public MainFrame() {
        super("Notepad");
        
        setLayout(new GridBagLayout());
        
        layoutFrame();
        
        // create and show window
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void layoutFrame() {
        // Create all necessary swing components here
    }
}
