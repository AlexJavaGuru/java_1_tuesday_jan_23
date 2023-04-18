package student_oksana_tarasova.lesson_13.level_4;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {

    boolean[][] fieldOfLife;

    public boolean[][] generate(int height, int width) {
        return new boolean[height][width];
    }

    public boolean[][] fillFieldOfLife(boolean[][] fieldOfLife) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fieldOfLife[i][j] = new Random().nextBoolean();
            }
        }
        return fieldOfLife;
    }
}