package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class GameBoard {

    private PrintStream printStream;
    private List<String> grid;

    public GameBoard(PrintStream printStream, List<String> grid) {
        this.printStream = printStream;
        this.grid = grid;
    }

    public void printBoard() {
        String board = String.format(
                "%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s", grid.toArray());

        printStream.println(board);
    }

    public void markBoard(int position, String mark) {
        grid.set(position-1, mark);
        printBoard();
    }

    public boolean verifyCellIsNotMarked(int position){
        if(grid.get(position-1).equals("X") || grid.get(position-1).equals("O")){
            printStream.println("Space already filled. Pick another:");
            return false;
        }
        return true;
    }
}
