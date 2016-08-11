package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> grid = Arrays.asList("1","2","3","4","5","6","7","8","9");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Player player1 = new Player(reader);
        Player player2 = new Player(reader);
        GameBoard gameBoard = new GameBoard(System.out, grid);
        Game game = new Game(System.out, gameBoard, player1, player2);
        game.start();

    }
}
