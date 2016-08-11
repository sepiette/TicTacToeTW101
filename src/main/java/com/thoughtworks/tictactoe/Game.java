package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {

    private GameBoard gameBoard;
    private Player player1;
    private Player player2;
    private PrintStream printStream;
    private Player currentPlayer;


    public Game(PrintStream printStream, GameBoard gameBoard, Player player1, Player player2) {
        this.printStream = printStream;
        this.gameBoard = gameBoard;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = null;
    }

    public void start() {
        gameBoard.printBoard();
        promptPlayerMove();
    }

    public void promptPlayerMove() {
        swapPlayer();
        executePlayerMove();
        swapPlayer();
        executePlayerMove();
    }

    private void swapPlayer() {
        if(currentPlayer == player1){
            currentPlayer = player2;
            printStream.println("Player Two, place O:");
        }
        else{
            currentPlayer = player1;
            printStream.println("Player One, place X:");
        }
    }

    private void executePlayerMove() {
        int place = currentPlayer.takeTurn();
        gameBoard.markBoard(place);
    }

}
