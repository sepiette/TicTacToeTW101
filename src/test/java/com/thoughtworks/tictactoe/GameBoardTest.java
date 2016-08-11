package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class GameBoardTest {


    private GameBoard gameBoard;
    private PrintStream printStream;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        List<String> grid = Arrays.asList("1","2","3","4","5","6","7","8","9");
        gameBoard = new GameBoard(printStream,grid);

    }

    @Test
    public void shouldPrintNewGameBoardWhenPrintCalled() {
        gameBoard.printBoard();
        verify(printStream).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");

    }

    @Test
    public void shouldPrintXInPositionOneWhenPlayerOneEntersOne(){
        gameBoard.markBoard(1,"X");
        verify(printStream).println("X|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }


    @Test
    public void shouldPrintOInPositionTwoWhenPlayerTwoEntersTwo() throws Exception {
        gameBoard.markBoard(2,"O");
        verify(printStream).println("1|O|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}