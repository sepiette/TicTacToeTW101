package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.PrintStream;

public class Game {

    private GameBoard gameBoard;
    private PrintStream printStream;


    public Game(PrintStream printStream, BufferedReader reader, GameBoard gameBoard) {
        this.printStream = printStream;
        this.gameBoard = gameBoard;
    }

    public void start() {
        gameBoard.printBoard();
        promptPlayerOneMove();
    }

    public void promptPlayerOneMove() {
        printStream.println("Player One, enter a cell number to place X:");
    }

    public void placeX() {
        gameBoard.reDraw();
    }
}
