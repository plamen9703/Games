package games.gui.snake;

import java.awt.Dimension;

import javax.swing.JFrame;

public class SnakeMainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int WIDTH=1000;
	private final int HEIGHT=1000;
	public SnakeMainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(WIDTH,HEIGHT));
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		
		add(new SnakeGamePanel());
	}

}
