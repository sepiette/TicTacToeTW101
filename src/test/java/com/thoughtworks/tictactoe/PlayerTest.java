package com.thoughtworks.tictactoe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PlayerTest {

    private BufferedReader reader;
    private Player player;

    @Before
    public void setUp() throws Exception {
        reader = mock(BufferedReader.class);
        player = new Player(reader);
    }


    @Test
    public void shouldReturnOneWhenPlayerChoosesCellOne() throws Exception {
        when(reader.readLine()).thenReturn("1");
        assertEquals(1,player.takeTurn());

    }

    @Test
    public void shouldReturnOneWhenPlayerChoosesCellTwo() throws Exception {
        when(reader.readLine()).thenReturn("1");
        assertEquals(1,player.takeTurn());
    }
}