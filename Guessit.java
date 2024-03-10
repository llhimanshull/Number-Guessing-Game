import javax.swing.JOptionPane;

public class Guessit {
  public static void main(String[] args) {
    int randomNumber = (int) (Math.random() * 100) + 1;
    int attempts = 0;

    JOptionPane.showMessageDialog(null,
        "Welcome to the Number Guessing Game!\nI'm thinking of a number between 1 and 100. Can you guess it?");

    int guess;
    do {
      String userInput = JOptionPane.showInputDialog("Enter your guess (between 1 and 100):");
      guess = Integer.parseInt(userInput);
      attempts++;

      if (guess < randomNumber) {
        JOptionPane.showMessageDialog(null, "Too low! Try again.");
      } else if (guess > randomNumber) {
        JOptionPane.showMessageDialog(null, "Too high! Try again.");
      }
    } while (guess != randomNumber);

    JOptionPane.showMessageDialog(null,
        "Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
  }
}
