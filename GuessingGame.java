import javax.swing.JOptionPane;

public class GuessingGame {
	
	private int randomNumber;
	private int numberOfGuesses;

	private static int numberOfGames;
	private static int totalNumberOfGuesses;

	public GuessingGame(int range) {
		JOptionPane.showMessageDialog(null, "Lets play!", "Guessing Game", JOptionPane.PLAIN_MESSAGE);
		randomNumber = (int) (Math.random() * range + 1);
		System.out.println("New game with range: 1 - " + range);
		numberOfGuesses = 0;

	}

	public boolean makeGuess() {
		
		int guess = (Integer.parseInt((JOptionPane.showInputDialog("Guess a number between 1-1000"))));
		numberOfGuesses ++;
		totalNumberOfGuesses ++;
		
		if (guess < randomNumber) {
			System.out.println(guess + " is too small");
			return false;
		} 
		else if (guess > randomNumber) {
			System.out.println(guess + " is too large");
			return false;
		}
		else {
			System.out.println(guess + " is correct");
			numberOfGames ++;
			int totalNumberOfGames = 0;
			totalNumberOfGames ++;
			return true;
		}
	}

	public int getNumberOfGuesses() {
		return numberOfGuesses;
	}

	public static double getAverage() {
		return (double) totalNumberOfGuesses / numberOfGames;
	}


}
