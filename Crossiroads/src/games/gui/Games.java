package games.gui;

public enum Games {
	CROSY_RAODS(1,"not started"),
	PONG(2,"not started"),
	DOTS_AND_BOXES(3,"not started"),
	FLAPYBIRD(4,"not started"),
	SNAKE(5,"not started");
	private final int gameId;
	private final String status;
	
	private Games(int id, String status) {
		this.gameId=id;
		this.status=status;
	}

	public int getGameId() {
		return gameId;
	}

	public String getStatus() {
		return status;
	}
	
}
