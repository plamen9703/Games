package games.gui;

import javax.swing.JOptionPane;

import games.gui.crosyroads.CrossyRoadsMainFrame;
import games.gui.dots_and_boxes.DotsAndBoxesMainFrame;
import games.gui.flappybird.FlappyBirdMainFrame;
import games.gui.pong.PongMainFrame;
import games.gui.snake.SnakeMainFrame;

public class GamePanelGenerator {
	
	public static void startGame(int id) {
		System.out.println(id);
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
	
	
	public static void main(String[] args) {
		Games g=(Games)JOptionPane.showInputDialog(null,"Select game:","Game selection",JOptionPane.INFORMATION_MESSAGE,null,Games.values(),Games.SNAKE);
		if(g==null)return;
		if(g.getStatus().equals("not started")){
			JOptionPane.showMessageDialog(null, "This game is not finished yet!","Warning",JOptionPane.WARNING_MESSAGE);
		}
		startGame(g.getGameId());
	}
}
