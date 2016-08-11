package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {

    private GameBoard gameBoard;
    private Player player1;
    private Player player2;
    private PrintStream printStream;
    private Player currentPlayer;
    private String playerMark;

    public Game(PrintStream printStream, GameBoard gameBoard, Player player1, Player player2) {
        this.printStream = printStream;
        this.gameBoard = gameBoard;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = null;
        this.playerMark = null;
    }

    public void start() {
        gameBoard.printBoard();
        promptPlayerMove();
    }

    private void promptPlayerMove() {
        swapPlayer();
        executePlayerMove();
        swapPlayer();
        executePlayerMove();
    }

    private void swapPlayer() {
        if(currentPlayer == player1){
            currentPlayer = player2;
            playerMark = "O";
            printStream.println("Player Two, place "+ playerMark +":");

        }
        else{
            currentPlayer = player1;
            playerMark = "X";
            printStream.println("Player One, place"+ playerMark +":");
        }
    }

    private void executePlayerMove() {
        int cell = currentPlayer.takeTurn();
        gameBoard.markBoard(cell, playerMark);
    }

}
