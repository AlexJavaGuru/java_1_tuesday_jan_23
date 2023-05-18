package student_aleksandrs_lezhennikovs.lesson_13.level_3.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Cell;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Coord;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Field;


import static org.junit.jupiter.api.Assertions.*;

class NextGenerationTest {
    private NextGeneration nextGeneration;
    private Field initField;
    private Field nextField;
    private Field actualField;

    @BeforeEach
    void setUp() {
        nextGeneration = new NextGeneration();
        initField = new Field(new Coord(10, 10));
        nextField = new Field(new Coord(10, 10));
        actualField = new Field(new Coord(10, 10));
    }

    @Test
    void testDieLessThanTwoLiveNeighbors() {
        initField.getCell(new Coord(0, 0)).setLive(true);
        nextField.getCell(new Coord(0, 0)).setLive(false);
        actualField = nextGeneration.getNextGeneration(initField);

        Cell[][] expected = nextField.getMatrix();
        Cell[][] actual = actualField.getMatrix();
        assertArrayEquals(expected, actual);
    }

    @Test
    void testDieMoreThanThreeNeighbors() {
        initField.getCell(new Coord(0, 0)).setLive(true);
        initField.getCell(new Coord(0, 1)).setLive(true);
        initField.getCell(new Coord(1, 1)).setLive(true);
        initField.getCell(new Coord(2, 1)).setLive(true);
        initField.getCell(new Coord(2, 2)).setLive(true);

        nextField.getCell(new Coord(0, 0)).setLive(true);
        nextField.getCell(new Coord(0, 1)).setLive(true);
        nextField.getCell(new Coord(1, 1)).setLive(false);
        nextField.getCell(new Coord(2, 1)).setLive(true);
        nextField.getCell(new Coord(2, 2)).setLive(true);
        Cell[][] expected = nextField.getMatrix();

        actualField = nextGeneration.getNextGeneration(initField);
        Cell[][] actual = actualField.getMatrix();
        assertArrayEquals(expected, actual);
    }

    @Test
    void bornIfNeighborsEqualThree() {
        initField.getCell(new Coord(0, 0)).setLive(true);
        initField.getCell(new Coord(0, 1)).setLive(true);
        initField.getCell(new Coord(1, 1)).setLive(true);

        nextField.getCell(new Coord(0, 0)).setLive(true);
        nextField.getCell(new Coord(0, 1)).setLive(true);
        nextField.getCell(new Coord(1, 1)).setLive(true);
        nextField.getCell(new Coord(1, 0)).setLive(true);

        Cell[][] expected = nextField.getMatrix();

        actualField = nextGeneration.getNextGeneration(initField);
        Cell[][] actual = actualField.getMatrix();
        assertArrayEquals(expected, actual);
    }

    @Test
    void continueLiveIfTwoNeighbors() {
        initField.getCell(new Coord(0, 0)).setLive(true);
        initField.getCell(new Coord(1, 1)).setLive(true);
        initField.getCell(new Coord(2, 2)).setLive(true);

        nextField.getCell(new Coord(0, 0)).setLive(false);
        nextField.getCell(new Coord(1, 1)).setLive(true);
        nextField.getCell(new Coord(2, 2)).setLive(false);


        Cell[][] expected = nextField.getMatrix();

        actualField = nextGeneration.getNextGeneration(initField);
        Cell[][] actual = actualField.getMatrix();
        assertArrayEquals(expected, actual);
    }

    @Test
    void continueLiveIfNeighborsThree() {
        initField.getCell(new Coord(0, 0)).setLive(true);
        initField.getCell(new Coord(0, 1)).setLive(true);
        initField.getCell(new Coord(1, 0)).setLive(true);
        initField.getCell(new Coord(1, 1)).setLive(true);

        nextField.getCell(new Coord(0, 0)).setLive(true);
        nextField.getCell(new Coord(0, 1)).setLive(true);
        nextField.getCell(new Coord(1, 0)).setLive(true);
        nextField.getCell(new Coord(1, 1)).setLive(true);


        Cell[][] expected = nextField.getMatrix();

        actualField = nextGeneration.getNextGeneration(initField);
        Cell[][] actual = actualField.getMatrix();
        assertArrayEquals(expected, actual);
    }
}