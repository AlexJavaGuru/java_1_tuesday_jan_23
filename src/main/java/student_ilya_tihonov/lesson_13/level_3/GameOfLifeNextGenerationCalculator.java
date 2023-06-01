package student_ilya_tihonov.lesson_13.level_3;


public class GameOfLifeNextGenerationCalculator {


    public String[][] calculate(String[][] currentGeneration) {
        int rows = currentGeneration.length;
        int columns = currentGeneration[0].length;
        String[][] nextGeneration = new String[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                int liveNeighbors = countLiveNeighbors(currentGeneration, row, col);
                if (currentGeneration[row][col]) {
                    if (liveNeighbors == 2 || liveNeighbors == 3) {
                        nextGeneration[row][col] = true;
                    } else {
                        nextGeneration[row][col] = false;
                    }
                } else {
                    if (liveNeighbors == 3) {
                        nextGeneration[row][col] = true;
                    } else {
                        nextGeneration[row][col] = false;
                    }
                }
            }
        }

        return nextGeneration;
    }

    private int countLiveNeighbors(String[][] currentGeneration, int row, int col) {
        int count = 0;
        int rows = currentGeneration.length;
        int columns = currentGeneration[0].length;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int neighborRow = row + i;
                int neighborCol = col + j;
                if (neighborRow >= 0 && neighborRow < rows && neighborCol >= 0 && neighborCol < columns) {
                    if (currentGeneration[neighborRow][neighborCol]) {
                        count++;
                    }
                }
            }

        }
        return count;
    }
}