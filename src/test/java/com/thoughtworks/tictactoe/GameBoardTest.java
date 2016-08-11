package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class GameBoardTest {


    private GameBoard gameBoard;
    private PrintStream printStream;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        gameBoard = new GameBoard(printStream);
    }

    @Test
    public void shouldPrintNewGameBoardWhenPrintCalled() {
        gameBoard.printBoard();
        verify(printStream).println("1|2|3");
        verify(printStream, times(2)).println("-----");
        verify(printStream).println("4|5|6");
        verify(printStream).println("7|8|9");

    }

    @Test
    public void shouldPrintXInPositionOneWhenPlayerOneEntersOne(){
        gameBoard.reDraw(1);
        verify(printStream).println("X|2|3");
        verify(printStream, times(2)).println("-----");
        verify(printStream).println("4|5|6");
        verify(printStream).println("7|8|9");
    }

    @Test
    public void shouldPrintXInPositionTwoWhenPlayerOneEntersTwo() throws Exception {
        gameBoard.reDraw(2);
        verify(printStream).println("1|X|3");
        verify(printStream, times(2)).println("-----");
        verify(printStream).println("4|5|6");
        verify(printStream).println("7|8|9");
    }
}