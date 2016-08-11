package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {

    private GameBoard gameBoard;
    private PrintStream printStream;
    private Game game;
    private BufferedReader reader;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {
        gameBoard = mock(GameBoard.class);
        reader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new Game(printStream, gameBoard, player1,player2);
    }

    @Test
    public void shouldCallPrintBoardMethodWhenGameStarts() throws IOException {
        when(reader.readLine()).thenReturn("0");
        game.start();
        verify(gameBoard).printBoard();
    }

    @Test
    public void shouldMakePlayerOneTakeFirstTurn() throws Exception {
        game.start();
        verify(player1).takeTurn();
    }

    @Test
    public void MarkGameBoardWithXWhenPlayerEntersPositionOne() throws IOException {
        when(player1.takeTurn()).thenReturn(1);
        game.start();
        verify(gameBoard).markBoard(1,"X");
    }

    @Test
    public void shouldMakePlayerTwoTakeTurnAfterPlayerOneTakesTurn() throws Exception {
        game.start();
        verify(player2).takeTurn();
    }

}