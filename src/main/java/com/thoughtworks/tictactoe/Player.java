package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
    private BufferedReader reader;

    public Player(BufferedReader reader) {
        this.reader = reader;
    }

    public int takeTurn() {
        int input = 0;
        try {
            input = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }


}
