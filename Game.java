import java.util.List;

class Game {
    private Board board;
    private List<Player> players;
    private Dice dice;
    private GameStatus status;
    private int currentPlayerIndex;

    public Game(Board board, List<Player> players, Dice dice) {
        this.board = board;
        this.players = players;
        this.dice = dice;
        this.status = GameStatus.NOT_STARTED;
        this.currentPlayerIndex = 0;
    }

    public void startGame() {
        status = GameStatus.IN_PROGRESS;
        System.out.println("Game started!\n");

        while (status == GameStatus.IN_PROGRESS) {
            takeTurn();
        }

        System.out.println("\nGame Over! Thanks for playing.");
    }

    private void takeTurn() {
        Player currentPlayer = players.get(currentPlayerIndex);
        System.out.println(currentPlayer.getName() + "'s turn.");

        int roll = dice.roll();
        System.out.println(currentPlayer.getName() + " rolled a " + roll + ".");

        int currentPosition = currentPlayer.getCurrentPosition();
        int newPosition = currentPosition + roll;

        System.out.println("Current Position: " + currentPosition + ", Rolled: " + roll + ", Tentative New Position: " + newPosition);

        if (newPosition > board.getSize()) {
            System.out.println(currentPlayer.getName() + " stays at " + currentPosition +
                               " (roll exceeds board size).\n");
        } else {
            newPosition = board.getFinalPosition(newPosition);
            System.out.println(currentPlayer.getName() + " moves to position " + newPosition + "\n");
            currentPlayer.setCurrentPosition(newPosition);

            if (newPosition == board.getSize()) {
                System.out.println(currentPlayer.getName() + " wins the game!");
                status = GameStatus.FINISHED;
                return;
            }
        }

        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }
}
