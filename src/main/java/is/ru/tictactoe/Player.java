package is.ru.tictactoe;

public class Player {

	private int score;
	private char symbol;

	public Player(char s) {
		score = 0;
		symbol = s;
	}

	public char getSymbol() {
		return symbol;
	}

	public int getScore() {
		return score;
	}

	public void incrementScore() {
		score++;
	}

	public int whatIsTheMeaningOfLife() {
		return 42;
	}
}
