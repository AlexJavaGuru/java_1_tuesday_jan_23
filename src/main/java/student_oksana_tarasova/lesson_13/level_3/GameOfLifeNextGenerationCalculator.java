package student_oksana_tarasova.lesson_13.level_3;

import java.util.Arrays;

public class GameOfLifeNextGenerationCalculator {

    public String[][] calculate(String[][] currentGeneration) {
        String[][] newField = copy(currentGeneration);
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration.length; j++) {
                int countLive = 0;
                if (i - 1 >= 0 && j - 1 >= 0 &&
                        currentGeneration[i - 1][j - 1].equals("\uF04A")) {
                    countLive++;
                }
                if (i - 1 >= 0 && currentGeneration[i - 1][j].equals("\uF04A")) {
                    countLive++;
                }
                if (i - 1 >= 0 && j + 1 < currentGeneration.length &&
                        currentGeneration[i - 1][j + 1].equals("\uF04A")) {
                    countLive++;
                }
                if (j - 1 >= 0 &&
                        currentGeneration[i][j - 1].equals("\uF04A")) {
                    countLive++;
                }
                if (j + 1 < currentGeneration.length &&
                        currentGeneration[i][j + 1].equals("\uF04A")) {
                    countLive++;
                }
                if (i + 1 < currentGeneration.length && j - 1 >= 0 &&
                        currentGeneration[i + 1][j - 1].equals("\uF04A")) {
                    countLive++;
                }
                if (i + 1 < currentGeneration.length &&
                        currentGeneration[i + 1][j].equals("\uF04A")) {
                    countLive++;
                }
                if (i + 1 < currentGeneration.length && j + 1 < currentGeneration.length &&
                        currentGeneration[i + 1][j + 1].equals("\uF04A")) {
                    countLive++;
                }

                if (currentGeneration[i][j].equals("\uF04A")) {
                    if (countLive < 2) {
                        newField[i][j] = "\uF0A1";

                    } else if (countLive == 2 || countLive == 3) {
                        newField[i][j] = "\uF04A";
                    } else if (countLive > 3) {
                        newField[i][j] = "\uF0A1";
                    }
                } else {
                    if (countLive == 3) {
                        newField[i][j] = "\uF04A";
                    }

                }

            }
        }
        return newField;
    }

    private static String[][] copy(String[][] currentGeneration) {
        String[][] copy = new String[currentGeneration.length][];
        for (int i = 0; i < currentGeneration.length; i++) {
            copy[i] = Arrays.copyOf(currentGeneration[i], currentGeneration[i].length);
        }
        return copy;
    }
}
