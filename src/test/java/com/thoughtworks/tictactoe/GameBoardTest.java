package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class GameBoardTest {


    @Test
    public void shouldPrintNewGameBoardWhenPrintCalled() {
        PrintStream printStream = mock(PrintStream.class);
        GameBoard gameBoard = new GameBoard(printStream);
        gameBoard.printBoard();
        verify(printStream).println("1|2|3");
        verify(printStream, times(2)).println("-----");
        verify(printStream).println("4|5|6");
        verify(printStream).println("7|8|9");

    }
    @Test
    public void shouldPrintXInPositionOneWhenUserEntersOne(){
        PrintStream printStream = mock(PrintStream.class);
        GameBoard gameBoard = new GameBoard(printStream);
        gameBoard.reDraw();
        verify(printStream).println("X|2|3");
        verify(printStream, times(2)).println("-----");
        verify(printStream).println("4|5|6");
        verify(printStream).println("7|8|9");
    }
}