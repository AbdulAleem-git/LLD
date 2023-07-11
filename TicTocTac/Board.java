public class Board {
    int size ;

    Piece[][] board;

    public Board(int size) {
        this.size = size;
        board = new Piece[size][size];
    }

    public boolean addPiece(int row, int column , Piece piece){
            if(board[row][column] != null)
                return false;
            
            board[row][column] = piece;
            return true;
    }   
    public boolean isFreeCell(){
        for(int i = 0; i < size ; i++){
            for(int j = 0 ; j < size; j++){
                if(board[i][j] == null)
                    return true;
            }
        }
        return false;
    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                   System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }


}
