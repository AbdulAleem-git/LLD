import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> players;

    Board board;

    Game(){
        initializeGame();
    }

    public void initializeGame(){
        players = new LinkedList<>();

        PieceX pieceX = new PieceX(PieceType.X);
        Player p1 = new Player("first", pieceX);


        PieceO pieceO = new PieceO(PieceType.O);
        Player p2 = new Player("second", pieceO);

        players.add(p1);
        players.add(p2);

        board = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;

        while(noWinner){
            Player playerTurn = players.removeFirst();

            board.printBoard();
            Boolean isfreeCell = board.isFreeCell();

            if(!isfreeCell){
                noWinner = false;
                continue;
            }

            System.out.print("player: " + playerTurn.name + " enter row, column");
            Scanner scanner = new Scanner(System.in);
            
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int row = Integer.valueOf(values[0]);
            int column = Integer.valueOf(values[1]);

            boolean isSuccess = board.addPiece(row, column, playerTurn.piece);

            if (!isSuccess){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = isThereWinner(row, column, playerTurn.piece.pieceType);
            if(winner){
                return playerTurn.name;
            }

        }
        return "tied";
        

    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<board.size;i++) {

            if(board.board[row][i] == null || board.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<board.size;i++) {

            if(board.board[i][column] == null || board.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<board.size;i++,j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=board.size-1; i<board.size;i++,j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}
