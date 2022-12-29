import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 5, 4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player p1 = new Player(0, "Abdul");
        Player p2 = new Player(0, "Arun");
        players.add(p1);
        players.add(p2);
    }

    public void startGame() throws InterruptedException {
        while (winner == null) {
            Player playerTurn = findPlayerTurn();
            int diceNumbers = dice.rollDice();
            int newPosition = playerTurn.currentPosition + diceNumbers;
            newPosition = jumpCheck(newPosition);
            playerTurn.currentPosition = newPosition;
            if (playerTurn.Id == "Abdul")
                System.out.printf("\r%s  %d\t\t\t%s  %d", playerTurn.Id, playerTurn.currentPosition,
                        players.getFirst().Id, players.getFirst().currentPosition);
            else
                System.out.printf("\r%s  %d\t\t\t%s  %d", players.getFirst().Id, players.getFirst().currentPosition,
                        playerTurn.Id, playerTurn.currentPosition);

            if (newPosition >= board.cells.length * board.cells.length - 1)
                winner = playerTurn;
            Thread.sleep(100);
        }
        System.out.println();
        System.out.printf("And Winner iiis \033[32m%s ", winner.Id);
        System.out.println();

    }

    private Player findPlayerTurn() {
        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }

    private int jumpCheck(int newPosition) {
        if (newPosition > board.cells.length * board.cells.length - 1)
            return newPosition;
        Cell cell = board.getCell(newPosition);
        if (cell.jump != null && cell.jump.start == newPosition) {
            return cell.jump.end;
        }
        return newPosition;
    }

}
