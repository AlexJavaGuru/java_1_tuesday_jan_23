package student_ilya_tihonov.lesson_13.level_3;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {

    String[][] fieldOfLife;

    public String[][] generate(int height, int width) {
        return new String [height][width];
    }

    public String[][] fillFieldOfLife(String[][] fieldOfLife) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int number = new Random().nextInt(2);
                if (number == 0) {
                    fieldOfLife[i][j] = "\uF04A";
                }
                if (number == 1) {
                    fieldOfLife[i][j] = "\uF0A1";
                }
            }
        }
        return fieldOfLife;
    }

}
