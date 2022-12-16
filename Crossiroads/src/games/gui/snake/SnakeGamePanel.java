package games.gui.snake;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class SnakeGamePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SnakeGamePanel() {
		setBackground(Color.BLACK);
		setSize(new Dimension(1000-18,1000-(47+100)));
	}

}
