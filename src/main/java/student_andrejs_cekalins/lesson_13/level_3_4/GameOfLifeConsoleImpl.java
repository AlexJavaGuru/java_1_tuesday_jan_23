package student_andrejs_cekalins.lesson_13.level_3_4;

public class GameOfLifeConsoleImpl implements GameOfLifeConsoleUI {
    @Override
    public void show(boolean[][] field) {
        System.out.println("_________________________________________________________________________________________________");
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (j==9) {
                    System.out.println("|||" +field[i][j] +"||");
                }else{
                    System.out.print("|||" +field[i][j] +"||");
                }
            }
        }
        System.out.println("_________________________________________________________________________________________________");
    }
}
