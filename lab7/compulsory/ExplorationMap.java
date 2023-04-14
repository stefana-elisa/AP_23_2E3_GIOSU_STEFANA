package org.lab7.compulsory;

import java.util.Arrays;
import java.util.List;

public class ExplorationMap {
    private final Cell[][] matrix;

    private int x;
    private int y;
    private final int n;

    public ExplorationMap(int n) {
        matrix = new Cell[n][n];
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                matrix[row][column] = new Cell();
            }
        }
        this.n = n;
    }

    public int getN() {
        return n;
    }

    //Cell should be a wrapper or alias for List<Token>
    public boolean visit(int row, int col, Robot robot) {
        synchronized (matrix[row][col]) {
            if (matrix[row][col].getTokens().isEmpty()) {
                List<Token> tokens = robot.mem.extractTokens(3);
                matrix[row][col].addTokens(tokens);
                System.out.println(robot.getName() + " visited cell (" + row + "," + col + ") and added " + tokens.toString());
                return true;
            }
            return false;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j].toString());
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
