import javax.swing.*;

/**
 * The {@code RockPaperScissorsRunner} class contains the main method to run the Rock Paper Scissors game.
 * It initializes and displays the game window to the user.
 */
public class RockPaperScissorsRunner {
    /**
     * Main method that creates an instance of {@link RockPaperScissorsFrame} and makes it visible.
     * This method serves as the entry point for the application.
     *
     * @param args Command-line arguments, not used in this application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RockPaperScissorsFrame frame = new RockPaperScissorsFrame();
            frame.setVisible(true);
        });
    }
}
