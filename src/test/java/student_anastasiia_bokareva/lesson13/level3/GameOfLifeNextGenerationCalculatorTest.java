package student_anastasiia_bokareva.lesson13.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculator test = new GameOfLifeNextGenerationCalculator();

    @Test
    public void checkCellLessThanTwoAlifeCells() {
        Boolean [][] cells = new Boolean[][]{
                {false, true,false,false},
                {false, false,false,false},
                {false, false,false,false},
                {false, false,false,false}};
        Boolean[][] expectedCells = new Boolean[][]{
                {false, false,false,false},
                {false, false,false,false},
                {false, false,false,false},
                {false, false,false,false}};
        boolean[][] checkedCells = test.calculate(cells);
        assertArrayEquals(expectedCells, checkedCells);

    }
}