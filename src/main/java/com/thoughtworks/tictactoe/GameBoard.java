package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class GameBoard {

    private PrintStream printStream;

    public GameBoard(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printBoard() {
        printStream.println("1|2|3");
        printStream.println("-----");
        printStream.println("4|5|6");
        printStream.println("-----");
        printStream.println("7|8|9");
    }

    public void reDraw() {
        printStream.println("X˚|2|3");
        printStream.println("-----");
        printStream.println("4|5|6");
        printStream.println("-----");
        printStream.println("7|8|9");
    }
}
