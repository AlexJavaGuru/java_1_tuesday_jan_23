package student_anastasiia_bokareva.lesson13.level3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculation test = new GameOfLifeNextGenerationCalculation();

    @Test
    public void checkCellLessThanTwoAlifeCells() {
        Integer [][] cells = new Integer[][]{
                {0, 1 ,0 ,0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        Integer[][] expectedCells = new Integer[][]{
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        Integer[][] checkedCells = test.calculate(cells);
        assertArrayEquals(expectedCells, checkedCells);

    }

    @Test
    public void checkCellMoreThanTwoAlifeCells() {
        Integer[][] cells = new Integer[][]{
                {0, 1, 1, 1},
                {0, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};
        Integer[][] expectedCells = new Integer[][]{
                {0, 1, 1, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};
        Integer[][] checkedCells = test.calculate(cells);
        assertArrayEquals(expectedCells, checkedCells);

    }

    @Test
    public void checkCellMoreThanThreeAlifeCells() {
        Integer[][] cells = new Integer[][]{
                {0, 1, 1, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};
        Integer[][] expectedCells = new Integer[][]{
                {0, 1, 0, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 1},
                {0, 0, 0, 0}};
        Integer[][] checkedCells = test.calculate(cells);
        assertArrayEquals(expectedCells, checkedCells);

    }

    @Test
    public void checkCellMoreThanThreeAlifeCellsIfCellIsDead() {
        Integer[][] cells = new Integer[][]{
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        Integer[][] expectedCells = new Integer[][]{
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        Integer[][] checkedCells = test.calculate(cells);
        assertArrayEquals(expectedCells, checkedCells);

    }

}