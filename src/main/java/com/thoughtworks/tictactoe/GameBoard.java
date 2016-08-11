package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class GameBoard {

    private PrintStream printStream;
    private String[][] grid = new String[3][3];

    public GameBoard(PrintStream printStream) {
        this.printStream = printStream;
        initiateGrid();

    }

    private void initiateGrid() {
        int cellVal = 1;
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                grid[i][j] = (""+cellVal);
                cellVal ++;
            }
        }
    }

    public void printBoard() {
        printStream.println(grid[0][0]+"|"+grid[0][1]+"|"+grid[0][2]);
        printStream.println("-----");
        printStream.println(grid[1][0]+"|"+grid[1][1]+"|"+grid[1][2]);
        printStream.println("-----");
        printStream.println(grid[2][0]+"|"+grid[2][1]+"|"+grid[2][2]);
    }

    public void reDraw(int xPlace) {
        int row = 0;
        int col = (xPlace+2) % 3;

        if(xPlace >3 && xPlace <=6){
            row = 1;
        }
        else if(xPlace > 6 && xPlace <=9){
            row = 2;
        }
        grid[row][col]= ("X");
        printBoard();
    }
}
