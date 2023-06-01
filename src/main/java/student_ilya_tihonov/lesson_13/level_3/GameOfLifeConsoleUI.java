package student_ilya_tihonov.lesson_13.level_3;

public class GameOfLifeConsoleUI implements GameOfLifeUI {

    @Override
    public void show(String[][] field) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 9)
                    System.out.println(field[i][j] + " ");
                else
                    System.out.print(field[i][j] + " ");
            }
        }
        System.out.println("------------------------------------");
    }

}
