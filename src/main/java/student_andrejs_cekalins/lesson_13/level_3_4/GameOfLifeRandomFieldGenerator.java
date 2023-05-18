package student_andrejs_cekalins.lesson_13.level_3_4;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight) {
        boolean[][] fillField = new boolean[fieldWidth][fieldHeight];
        Random random = new Random();
        for (int i = 0; i < fieldWidth; i++) {
            for (int j = 0; j < fieldHeight; j++) {
                fillField[i][j] = random.nextBoolean();
            }
        }
        return fillField;
    }
}
