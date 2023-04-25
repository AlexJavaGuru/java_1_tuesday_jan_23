package student_andrejs_cekalins.lesson_13.level_3_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class GameOfLifeNextGenerationCalculatorTest {
GameOfLifeNextGenerationCalculator test = new GameOfLifeNextGenerationCalculator();

    @BeforeEach
    void setUp() {
    }

    @Test
    void anyLiveCellDieIfItIsLessThanTwoNeighbors() {
        boolean[][] currentGeneration = new boolean[][]{
                {false, false, false, false, false},
                {false, false, false, true, false},
                {false, true, false, false, false},
                {true, false, false, false, true},
                {false, false, false, false, false}
        };
        boolean[][] expected = new boolean[][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(actual,expected);
    }
    @Test
    void anyLiveCellNotDieIfItIsTwoNeighbors() {
        boolean[][] currentGeneration = new boolean[][]{
                {true, true, false, false, false},
                {true, false, false, false, false},
                {false,false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] expected = new boolean[][]{
                {true, true, false, false, false},
                {true, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(actual,expected);
    }
    @Test
    void anyLiveCellDieIfItIsMoreThanThreeNeighbors() {
        boolean[][] currentGeneration = new boolean[][]{
                {false, false, false, false, false},
                {false, true, true, false, false},
                {true, true, false, false, false},
                {true, false, true, true, true},
                {false, false, false, true, true}
        };
        boolean[][] expected = new boolean[][]{
                {false, false, false, false, false},
                {true, true, true, false, false},
                {true, false, false, false, false},
                {true, false, true, false, true},
                {false, false, true, false, true}
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(actual,expected);
    }
    @Test
    void anyLiveCellNotDieIfItIsThreeNeighbors() {
        boolean[][] currentGeneration = new boolean[][]{
                {false, false, true, false, false},
                {false, true, true, false, false},
                {false, true, false, false, false},
                {false, false, true, false, false},
                {false, true, true, true, false}
        };
        boolean[][] expected = new boolean[][]{
                {false, true, true, false, false},
                {false, true, true, false, false},
                {false, true, false, false, false},
                {false, false, false, true, false},
                {false, true, true, true, false}
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(actual,expected);
    }
    @Test
    void anyDeadCellBecomeLiveIfItIsThreeLiveNeighbors() {
        boolean[][] currentGeneration = new boolean[][]{
                {false, true, false, false, false},
                {true, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] expected = new boolean[][]{
                {true, true, false, false, false},
                {true, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(actual,expected);
    }
    @Test
    void anyDeadCellNotBecomeLiveIfItIsMoreThanThreeLiveNeighbors() {
        boolean[][] currentGeneration = new boolean[][]{
                {true, false, true, false, false},
                {true, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] expected = new boolean[][]{
                {true, false, false, false, false},
                {true, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(actual,expected);
    }
    @Test
    void anyDeadCellNotBecomeLiveIfItIsLessThanThreeLiveNeighbors() {
        boolean[][] currentGeneration = new boolean[][]{
                {false, false, true, false, false},
                {false, true, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] expected = new boolean[][]{
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        boolean[][] actual = test.calculate(currentGeneration);
        assertArrayEquals(actual,expected);
    }
}