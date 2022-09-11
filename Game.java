package TicTacToe;

import java.util.*;

public class Game {
    static String[] board = new String[9];
    Scanner sc = new Scanner(System.in);

    static String checkWinner() {
        for (int i = 0; i < 9; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            }
            if (line.equals("OOO")) {
                return "O";
            }
            if (i == 8) {
                return "draw";
            }
        }
        return null;
    }

    static printBoard() {
        for (int i = 0; i<9; i++) {
            if (board[i].equals(null)) {
                System.out.print("[ ]");
            } else {
                System.out.print("[ " + board[i] + " ]");
            }
            if (i == 2 || i == 5) {
                System.out.print('\n');
            }
        }
    }
}