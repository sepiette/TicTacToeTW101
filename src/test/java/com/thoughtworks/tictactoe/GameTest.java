package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    private GameBoard gameBoard;
    private PrintStream printStream;
    private Game game;
    private BufferedReader reader;

    @Before
    public void setUp() {
        gameBoard = mock(GameBoard.class);
        reader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        game = new Game(printStream, reader, gameBoard);
    }

    @Test
    public void shouldCallPrintBoardMethodWhenGameStarts() {
        game.start();
        verify(gameBoard).printBoard();
    }

    @Test
    public void displayPromptMessageForPlayerOneMove() throws Exception {
        game.promptPlayerOneMove();
        verify(printStream).println("Player One, enter a cell number to place X:");
    }

    @Test
    public void reDrawGameBoardWhenPlayerOneEntersPosition(){
        game.placeX();
        verify(gameBoard).reDraw();
    }
}