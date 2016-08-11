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

    @Before
    public void setUp() {
        gameBoard = mock(GameBoard.class);
        reader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        game = new Game(printStream, reader, gameBoard);
    }

    @Test
    public void shouldCallPrintBoardMethodWhenGameStarts() throws IOException {
        when(reader.readLine()).thenReturn("0");
        game.start();
        verify(gameBoard).printBoard();
    }

    @Test
    public void displayPromptMessageForPlayerOneMove() throws Exception {
        when(reader.readLine()).thenReturn("0");
        game.promptPlayerOneMove();
        verify(printStream).println("Player One, place X:");
    }

    @Test
    public void reDrawGameBoardWhenPlayerOneEntersPosition() throws IOException {
        when(reader.readLine()).thenReturn("1");
        game.placeX();
        verify(gameBoard).reDraw(1);
    }
}