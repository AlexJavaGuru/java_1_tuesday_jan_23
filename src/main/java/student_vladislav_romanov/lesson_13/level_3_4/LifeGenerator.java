package student_vladislav_romanov.lesson_13.level_3_4;

class LifeGenerator {

    private boolean[][] generation;
    private boolean[][] nextGeneration;

    public LifeGenerator(Field field) {
        this.generation = field.getFieldOfLife();
        this.nextGeneration = new boolean[field.getHeight()][field.getWidth()];
    }

    public boolean[][] generate() {
        for (int i = 0; i < generation.length; i++) {
            for (int j = 0; j < generation[i].length; j++) {
                int neighbours = checkNeighbours(i, j);
                if (cellIsAlive(i, j) && (neighbours == 2 || neighbours == 3) ||
                        !cellIsAlive(i, j) && neighbours >= 3) {
                    createLife(i, j);
                } else {
                    killLife(i, j);
                }
            }
        }
        return nextGeneration;
    }

    public boolean cellInRange(int i, int j) {
        return i >= 0 && i < generation.length && j >= 0 && j < generation[i].length;
    }

    public boolean cellIsAlive(int i, int j) {
        return generation[i][j];
    }

    public int checkNeighbours(int row, int col) {
        int neighbours = 0;

        for (int i = row-1; i <= row+1; i++) {
            for (int j = col-1; j <= col+1; j++) {
                if (cellInRange(i, j) && (cellIsAlive(i, j)) && !(i == row && j == col)) {
                    neighbours++;
                }
            }
        }

        return neighbours;
    }

    public void createLife(int i, int j) {
        nextGeneration[i][j] = true;
    }

    public void killLife(int i, int j) {
        nextGeneration[i][j] = false;
    }

}
