import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initailizeCells(boardSize);
        addSnakeAndLadders(numberOfSnakes, numberOfLadders);
    }

    private void initailizeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }

        }
    }

    private void addSnakeAndLadders(int numberOfSnakes, int numberOfLadders) {
        while (numberOfSnakes > 0) {
            int tail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int head = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            if (tail >= head)
                continue;

            Jump jump = new Jump();
            jump.start = head;
            jump.end = tail;
            Cell cell = getCell(head);
            cell.jump = jump;

            numberOfSnakes--;
        }
        while (numberOfLadders > 0) {
            int start = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int end = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            if (start >= end)
                continue;

            Jump jump = new Jump();
            jump.start = start;
            jump.end = end;
            Cell cell = getCell(start);
            cell.jump = jump;

            numberOfLadders--;
        }
    }

    public Cell getCell(int head) {
        int row = head / cells.length;
        int column = head % cells.length;

        return cells[row][column];
    }
}
