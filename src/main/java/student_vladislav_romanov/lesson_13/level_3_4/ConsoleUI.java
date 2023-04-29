package student_vladislav_romanov.lesson_13.level_3_4;

public class ConsoleUI {

    private static final char ALIVE = '\u2b24';
    private static final char DEAD = '\u25a2';

    public void print(Field field) {
        boolean[][] fieldOfLife = field.getFieldOfLife();
        for (boolean [] row : fieldOfLife) {
            for (boolean cell : row) {
                if (cell) {
                    System.out.print("\u001B[33m" + ALIVE + "\u001B[0m");
                } else {
                    System.out.print(DEAD);
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------");
    }
}
