package org.wojcieszko.magnets;

public class Magnets {

    private boolean[][] board;

    public int[] position;

    public void setPosition(int[] position) {
        this.position = position;
    }

    public boolean[][] getBoard() {
        return board;
    }

    public void setBoard(boolean[][] board) {
        this.board = board;
    }

    public Magnets(boolean[][] board, int[] pos) {
        setBoard(board);
        setPosition(pos);
    }

    public int magnetsOn(int[] sequence) {
        int moveCounter = 0;

        for (int x = 0; x < sequence.length; ++x) {
            switch (sequence[x]) {

                case 1:

                    while ((position[0] - 1 >= 0) && (board[position[0] - 1][position[1]])) {
                        ++moveCounter;
                        --position[0];
                    }
                    break;

                case 2:

                    while ((board[position[0]].length > position[1] + 1) && board[position[0]][position[1] + 1]) {
                        ++moveCounter;
                        ++position[1];
                    }
                    break;

                case 3:

                    while ((board.length > position[0] + 1) && (board[position[0] + 1][position[1]])) {
                        ++moveCounter;
                        ++position[0];
                    }
                    break;

                case 4:

                    while ((position[1] - 1 >= 0) && (board[position[0]][position[1] - 1])) {
                        ++moveCounter;
                        --position[1];
                    }
                    break;

            }
        }

        return moveCounter;
    }

}
