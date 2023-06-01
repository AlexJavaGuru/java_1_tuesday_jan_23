package student_ilya_tihonov.lesson_13.level_3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameOfLifeNextGenerationCalculatorTest {

    @Test
    void testUnderpopulation() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

        String[][] currentGeneration = {
                {false, false, false},
                {false, true, false},
                {false, false, false}
        };

        boolean[][] expectedNextGeneration = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };

        String[][] actualNextGeneration = calculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedNextGeneration, actualNextGeneration);
    }

    @Test
    void testOverpopulation() {

        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

        String[][] currentGeneration = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        boolean[][] expectedNextGeneration = {
                {true, false, true},
                {false, false, false},
                {true, false, true}
        };

        String[][] actualNextGeneration = calculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedNextGeneration, actualNextGeneration);
    }

    @Test
    void testSurvival() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

        String[][] currentGeneration = {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };

        boolean[][] expectedNextGeneration = {
                {false, true, false},
                {false, true, false},
                {false, true, false}
        };

        String[][] actualNextGeneration = calculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedNextGeneration, actualNextGeneration);
    }


    @Test
    void testCellRevival() {
        GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

        String[][] currentGeneration = {
                {false, true, false},
                {false, true, false},
                {false, true, false}
        };

        boolean[][] expectedNextGeneration = {
                {false, false, false},
                {true, true, true},
                {false, false, false}
        };

        String[][] actualNextGeneration = calculator.calculate(currentGeneration);

        Assertions.assertArrayEquals(expectedNextGeneration, actualNextGeneration);
    }
}