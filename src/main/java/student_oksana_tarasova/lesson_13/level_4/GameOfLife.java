package student_oksana_tarasova.lesson_13.level_4;

import student_oksana_tarasova.lesson_13.level_3.GameOfLifeNextGenerationCalculator;

import java.util.concurrent.TimeUnit;

public class GameOfLife {
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        String[][] field = generator.generate(10, 10);
        generator.fillFieldOfLife(field);
        while(true) {
            ui.show(field);
            sleepForSeconds(5);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        GameOfLife gameOfLife = new GameOfLife();
        gameOfLife.run();
    }
}
