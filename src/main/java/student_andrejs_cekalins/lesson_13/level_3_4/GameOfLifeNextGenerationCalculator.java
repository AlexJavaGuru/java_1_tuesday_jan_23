package student_andrejs_cekalins.lesson_13.level_3_4;

import java.util.Arrays;

public class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = cloneGeneration(currentGeneration);
        for (int row = 0; row < currentGeneration.length; ++row)
            for (int col = 0; col < currentGeneration[row].length; ++col) {
                int numNeighbors = countNeighbors(currentGeneration, row, col);
                if ((numNeighbors < 2) || (numNeighbors > 3)) {
                    nextGeneration[row][col] = false;
                }
                if (numNeighbors == 2)  {
                    nextGeneration[row][col]=currentGeneration[row][col];
                }
                if (numNeighbors==3) {
                    nextGeneration[row][col]=true;
                }
            }
        return nextGeneration;
    }

    private boolean[][] cloneGeneration(boolean originalGeneration[][]) {
        boolean[][] newGeneration = new boolean[originalGeneration.length][];
        for (int row = 0; row < originalGeneration.length; ++row) {
            newGeneration[row] = Arrays.copyOf(originalGeneration[row], originalGeneration[row].length);
        }
        return newGeneration;
    }

    private int countNeighbors(boolean[][] currentGeneration, int row, int col) {
        int numberOfNeighbors = 0;
        if ((row - 1 >= 0) && (col - 1 >= 0)) {
            numberOfNeighbors = currentGeneration[row - 1][col - 1] ? numberOfNeighbors + 1 : numberOfNeighbors;
        }
        if ((row >= 0) && (col - 1 >= 0)) {
            numberOfNeighbors = currentGeneration[row][col - 1] ? numberOfNeighbors + 1 : numberOfNeighbors;
        }
        if ((row + 1 < currentGeneration.length) && (col - 1 >= 0)) {
            numberOfNeighbors = currentGeneration[row + 1][col - 1] ? numberOfNeighbors + 1 : numberOfNeighbors;
        }
        if ((row + 1 < currentGeneration.length) && (col < currentGeneration[0].length)) {
            numberOfNeighbors = currentGeneration[row + 1][col] ? numberOfNeighbors + 1 : numberOfNeighbors;
        }
        if ((row + 1 < currentGeneration.length) && (col + 1 < currentGeneration[0].length)) {
            numberOfNeighbors = currentGeneration[row + 1][col + 1] ? numberOfNeighbors + 1 : numberOfNeighbors;
        }
        if ((row < currentGeneration.length) && (col + 1 < currentGeneration[0].length)) {
            numberOfNeighbors = currentGeneration[row][col + 1] ? numberOfNeighbors + 1 : numberOfNeighbors;
        }
        if ((row - 1 >= 0) && (col + 1 < currentGeneration[0].length)) {
            numberOfNeighbors = currentGeneration[row - 1][col + 1] ? numberOfNeighbors + 1 : numberOfNeighbors;
        }
        if ((row - 1 >= 0) && (col < currentGeneration[0].length)) {
            numberOfNeighbors = currentGeneration[row - 1][col] ? numberOfNeighbors + 1 : numberOfNeighbors;
        }
        return numberOfNeighbors;


    }
}
