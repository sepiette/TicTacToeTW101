package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {

    private BufferedReader reader;
    private GameBoard gameBoard;
    private PrintStream printStream;


    public Game(PrintStream printStream, BufferedReader reader, GameBoard gameBoard) {
        this.printStream = printStream;
        this.reader = reader;
        this.gameBoard = gameBoard;
    }

    public void start() {
        gameBoard.printBoard();
        promptPlayerOneMove();

    }

    public void promptPlayerOneMove() {
        printStream.println("Player One, place X:");
        placeX();
    }

    public void placeX() {
        int xPlace = -1;
        try {
            xPlace = Integer.parseInt(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
        gameBoard.reDraw(xPlace);
    }
}
