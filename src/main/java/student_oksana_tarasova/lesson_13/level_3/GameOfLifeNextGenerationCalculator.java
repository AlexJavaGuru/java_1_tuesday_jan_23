package student_oksana_tarasova.lesson_13.level_3;

public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration.length; j++) {
                for (int si = i -1; si <= i + 1; si++) {
                    for(int sj = j-1; sj <= j+1; sj++) {
                        if (!(si == 0 && sj == 0)) {

                        }
                    }
                }
            }
        }

        return null; // реализацию напишем тут чуть позже
    }
}
