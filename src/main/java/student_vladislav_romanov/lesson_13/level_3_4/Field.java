package student_vladislav_romanov.lesson_13.level_3_4;

import java.util.Random;

public class Field {
    private int width;
    private int height;
    private boolean[][] fieldOfLife;

    public Field(int width, int height, int population) {
        this.width = width;
        this.height = height;
        this.fieldOfLife = fillFieldWithLife(createEmptyField(), population);
    }

    public Field(int width, int height, boolean[][] fieldOfLife) {
        this.width = width;
        this.height = height;
        this.fieldOfLife = fieldOfLife;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean[][] getFieldOfLife() {
        return fieldOfLife;
    }

    public void setFieldOfLife(boolean[][] fieldOfLife) {
        this.fieldOfLife = fieldOfLife;
    }

    public boolean[][] createEmptyField() {
        return new boolean[height][width];
    }

    public boolean[][] fillFieldWithLife(boolean[][] field, int population) {
        Random random = new Random();
        int limit = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean cellState = random.nextBoolean();
                if (limit < population) {
                    field[i][j] = cellState;
                    limit++;
                } else {
                    field[i][j] = false;
                }
            }
        }
        return field;
    }

}