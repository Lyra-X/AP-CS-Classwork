package com.company;
/*
Lyra W. S3C7 Daniel Gunn 2017/11/22
A simple 3x3 Tic-Tac-Toe game.
* @param r the row number
* @param c the column number
* @param symbol the symbol to be placed on board[r][c]
* Precondition: The square board[r][c] is empty.
* Post condition: Symbol placed in that square.
*/
import java.util.Scanner;
public class TicTacToeLyra {
    private static String[][] board;
    private static final int R = 3;
    private static final int C = 3;
    public TicTacToeLyra() {
        board = new String[R][C];
        for (int r = 0; r < R; r++)
        for (int c = 0; c < C; c++)
            board[r][c] = " ";
    }
    public void makeMove(int r, int c, String symbol) {
        board[r][c] = symbol;
    }
    public String toString() {
        String s = "";
        for (int r = 0; r < R; r++){
            s = s + "|";
        for (int c = 0; c < C; c++)
            s = s + board[r][c];
        s = s + "|\n";
        }
        return s;
    }
    public static boolean result1 (String in, int r, int c) {
        if (in.equals(board[r][0]) && in.equals(board[r][1]) && in.equals(board[r][2])
                || (in.equals(board[0][c]) && in.equals(board[1][c]) && in.equals(board[2][c]))){
            return true;
        }
        return false;
    }
    public static boolean tie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(board[i][j])) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TicTacToeLyra game = new TicTacToeLyra();
        System.out.print(game.toString());
        Scanner input = new Scanner(System.in);
        boolean play = true;
        boolean result;
        int count = 0;
        while (play) {
            if (count % 2 == 0) {
                System.out.print("Input Row: ");
                int r = input.nextInt() - 1;
                System.out.print ("Input Column: ");
                int c = input.nextInt() - 1;
                String inx = "X";
                game.makeMove(r, c, inx);
                System.out.print(game.toString());
                result = result1(inx, r, c);
                if (result) {
                    System.out.println("Congrats, Player X!");
                    break;
                }
            } else {
                System.out.print("Input Row: ");
                int r = input.nextInt() - 1;
                System.out.print("Input Column: ");
                int c = input.nextInt() - 1;
                String ino = "O";
                game.makeMove(r, c, ino);
                System.out.println(game.toString());
                result = result1(ino, r, c);
                if (result) {
                    System.out.println("Congrats, Player O! ");
                    break;
                }
            }
            count++;
            play = tie();
            if (!play) {
                System.out.print("Tie");
            }
        }
    }
}
