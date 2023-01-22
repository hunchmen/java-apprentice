/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2023. All Rights Reserved.
 * 
 */
package com.via.course4.arrays.primitive.types;

import java.util.Scanner;

/**
 * 
 * @author via
 * 
 * @date 21 Jan 2023
 */
public class TicTacToe {
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    private static char[][] board = new char[ROWS][COLUMNS];

    public static void main(String[] args) {
        // Initialize the board to empty spaces
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = ' ';
            }
        }

        // Start the game loop
        while (true) {
            // Print the current state of the board
            printBoard();

            // Get the next move from the first player
            Scanner input = new Scanner(System.in);
            System.out.print("Player X, enter row (0-2): ");
            int row = input.nextInt();
            System.out.print("Player X, enter column (0-2): ");
            int col = input.nextInt();

            // Place an 'X' on the board
            board[row][col] = 'X';

            // Check if player X has won
            if (checkWin('X')) {
                System.out.println("Player X wins!");
                break;
            }

            // Check for a tie
            if (checkTie()) {
                System.out.println("Tie game!");
                break;
            }

            // Get the next move from the second player
            System.out.print("Player O, enter row (0-2): ");
            row = input.nextInt();
            System.out.print("Player O, enter column (0-2): ");
            col = input.nextInt();

            // Place an 'O' on the board
            board[row][col] = 'O';

            // Check if player O has won
            if (checkWin('O')) {
                System.out.println("Player O wins!");
                break;
            }

            // Check for a tie
            if (checkTie()) {
                System.out.println("Tie game!");
                break;
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }

    private static boolean checkWin(char player) {
        // Check rows
        for (int i = 0; i < ROWS; i++) {
            if (board[i][0] == player && board[i][1] == player
                    && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < COLUMNS; i++) {
            if (board[0][i] == player && board[1][i] == player
                    && board[2][i] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player
                && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player
                && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static boolean checkTie() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
