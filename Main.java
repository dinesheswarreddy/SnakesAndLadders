import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get board size from user
        System.out.print("Enter the size of the board (e.g., 100): ");
        int boardSize = Integer.parseInt(scanner.nextLine());

        // Create board
        Board board = new Board(boardSize);

        // Add snakes and ladders dynamically
        addMovers(board);

        // Get number of players
        System.out.print("Enter the number of players: ");
        int numPlayers = Integer.parseInt(scanner.nextLine());

        // Create players with names input
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            players.add(new Player(i + 1, playerName));
        }

        // Get number of dice to roll
        System.out.print("Enter the number of dice to roll: ");
        int diceCount = Integer.parseInt(scanner.nextLine());

        // Create dice and start the game
        Dice dice = new Dice(diceCount);
        Game game = new Game(board, players, dice);
        game.startGame();

        scanner.close();
    }

    private static void addMovers(Board board) {
        // Add 2 small, 1 large, and 2 medium-sized snakes and ladders
        // Small Snakes
        board.addMover(new Snake(28, 15));  // Small Snake
        board.addMover(new Snake(98, 80));  // Small Snake

        // Medium Snakes
        board.addMover(new Snake(85, 45));  // Medium Snake
        board.addMover(new Ladder(3, 22)); // Medium Ladder

        // Large Snake
        board.addMover(new Snake(60, 10)); // Large Snake

        // Add a large ladder
        board.addMover(new Ladder(7, 50));  // Large Ladder
    }
}
