package student_oksana_tarasova.lesson_13.level_3;

public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        int countTrue = 0;
        for (int i = 1; i < currentGeneration.length - 1; i += 2) {
            for (int j = 1; j < currentGeneration.length - 1; j += 2) {
                for (int si = i - 1; si <= i + 1; si++) {
                    for (int sj = j - 1; sj <= j + 1; sj++) {
                        if (currentGeneration[si][sj] == true) {
                            countTrue++;
                        }
                    }
                }
                if (currentGeneration[i][j] == true) {
                    if (countTrue == 1) {
                        currentGeneration[i][j] = false;
                    } else if (countTrue == 2 || countTrue == 3) {
                        currentGeneration[i][j] = true;
                    } else if (countTrue >= 4) {
                        currentGeneration[i][j] = false;
                    }
                } else {
                    if (countTrue == 3) {
                        currentGeneration[i][j] = true;
                    }
                }
            }
        }
        return currentGeneration;
    }
}
