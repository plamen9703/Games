package games.gui;

import games.gui.crosyroads.CrossyRoadsMainFrame;
import games.gui.dots_and_boxes.DotsAndBoxesMainFrame;
import games.gui.flappybird.FlappyBirdMainFrame;
import games.gui.pong.PongMainFrame;
import games.gui.snake.SnakeMainFrame;

public class GamePanelGenerator {
	
	public static void getGamePanel(int id) {
		switch(id) {
		case 1:
			new CrossyRoadsMainFrame();
			break;
		case 2:
			new PongMainFrame();
			break;
		case 3:
			new DotsAndBoxesMainFrame();
			break;
		case 4:
			new FlappyBirdMainFrame();
			break;
		case 5:
			new SnakeMainFrame();
			break;
		}
	}
	
}
