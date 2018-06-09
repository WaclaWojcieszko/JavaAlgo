package org.wojcieszko.sudoku;

public class Sudoku {

    static int[] square = {
            0, 0, 1, 1,
            0, 0, 1, 1,
            2, 2, 3, 3,
            2, 2, 3, 3
    };

    static int[] row = {
            0, 0, 0, 0,
            1, 1, 1, 1,
            2, 2, 2, 2,
            3, 3, 3, 3
    };

    static int[] col = {
            0, 1, 2, 3,
            0, 1, 2, 3,
            0, 1, 2, 3,
            0, 1, 2, 3
    };

    public boolean miniCheck(int idx, int value, int[] board, int[] check) {

        int mySquare = check[idx];

        for (int i = 0; i < 15; ++i) {
            if (check[i] != mySquare) {
                continue;
            }

            if (check[i] == mySquare) {
                if (board[i] == value) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean check(int idx, int value, int[] board) {

//        if (board[idx] != -1) {
//            return false;
//        }

        return (miniCheck(idx, value, board, square)) &&
                (miniCheck(idx, value, board, row)) &&
                (miniCheck(idx, value, board, col));

    }

    public boolean solve(int[] board) {

        int[] boardClone = board.clone();

        int idx = 0;
        for (idx = 0; idx < board.length; ++idx) {
            if (boardClone[idx] == -1) {
                break;
            }
        }

        if (idx == board.length) {
            printBoard(boardClone);
            return false;
        }

        for (int value = 1; value <= 4; ++value) {

            if (check(idx, value, boardClone)) {
                boardClone[idx] = value;
                solve(boardClone);
                boardClone[idx] = -1;
            }

        }

        return true;

    }

    public void printBoard(int[] board) {

        int i = 0;

        System.out.println("==============");
        System.out.println("| " + board[i] + " " + board[++i] + " || " + board[++i] + " " + board[++i] + " |");
        System.out.println("| " + board[++i] + " " + board[++i] + " || " + board[++i] + " " + board[++i] + " |");
        System.out.println("==============");
        System.out.println("| " + board[++i] + " " + board[++i] + " || " + board[++i] + " " + board[++i] + " |");
        System.out.println("| " + board[++i] + " " + board[++i] + " || " + board[++i] + " " + board[++i] + " |");
        System.out.println("==============");

    }

}
