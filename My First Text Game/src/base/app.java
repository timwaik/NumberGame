package base;

public class app {

	public static void main(String[] args) {
		int YesNo;
		gamemaster.greetings();
		gamemaster.rules();
		String name = gamemaster.name();
		game game = new game(name);
		do {
			game.start();
			game.running();
			game.calculateScore();
			game.gameFinish();
			YesNo = gamemaster.playAgain();
		} while (YesNo == 1);

	}

}
