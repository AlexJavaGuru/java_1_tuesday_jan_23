package student_anastasiia_bokareva.lesson13.level4;

import student_anastasiia_bokareva.lesson13.level3.GameOfLifeNextGenerationCalculation;


import java.lang.reflect.Array;
import java.util.concurrent.TimeUnit;

class GameOfLife {
    private GameOfLifeConsole ui = new GameOfLifeConsole();
    private GameOfLifeRandomGenerator generator = new GameOfLifeRandomGenerator();
    private GameOfLifeNextGenerationCalculation calculator = new GameOfLifeNextGenerationCalculation();

    public void run() {
        Integer [][] field = generator.field(10, 10);
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
