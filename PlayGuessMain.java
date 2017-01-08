import javax.swing.JOptionPane;

public class PlayGuessMain {

	public static void main(String[] args) {
		int answer;
		

		do	{
				
		GuessingGame game = new GuessingGame(1000);
		while (game.makeGuess() != true) {
			System.out.println("Guess number " + game.getNumberOfGuesses());
		}
				System.out.println("Total of guesses: " + GuessingGame.getAverage());
		answer = JOptionPane.showConfirmDialog(null, "Are you up for one more round?");
		
		}while (answer == JOptionPane.YES_OPTION);
	}

}
