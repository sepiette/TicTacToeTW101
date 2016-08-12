package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {

    private GameBoard gameBoard;
    private Player player1;
    private Player player2;
    private PrintStream printStream;
    private Player currentPlayer;
    private String playerSymbol;

    public Game(PrintStream printStream, GameBoard gameBoard, Player player1, Player player2) {
        this.printStream = printStream;
        this.gameBoard = gameBoard;
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = null;
        this.playerSymbol = null;
    }

    public void start() {
        gameBoard.printBoard();
        swapPlayer();
        executePlayerMove();
        swapPlayer();
        executePlayerMove();
    }

    private void swapPlayer() {
        if(currentPlayer == player1){
            currentPlayer = player2;
            promptPlayer("Two","O");
        }
        else{
            currentPlayer = player1;
            promptPlayer("One","X");
        }
    }

    private void promptPlayer(String playerNumber,String symbol) {
        playerSymbol = symbol;
        printStream.println("Player"+playerNumber+", place "+ playerSymbol +":");
    }

    private void executePlayerMove() {
        int cell = currentPlayer.takeTurn();
//        while(!gameBoard.verifyCellIsNotMarked(cell)){
//            cell = currentPlayer.takeTurn();
//        }
        gameBoard.markBoard(cell, playerSymbol);
    }

}
