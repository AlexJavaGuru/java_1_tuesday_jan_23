package student_aleksandrs_lezhennikovs.lesson_13.level_3.services;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Coord;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Field;

import static org.junit.jupiter.api.Assertions.*;

class NextGenerationTest {
    private NextGeneration nextGeneration;

    @BeforeEach
    void setUp() {
        nextGeneration = new NextGeneration();
    }

    @Test
    void testDieLessThanTwoLiveNeighbor() {
        Field initMatrix = new Field(new Coord(10, 10));
        initMatrix.getCell(new Coord(0, 0)).setLive(true);

        Field nextMatrix = new Field(new Coord(10, 10));
        nextMatrix.getCell(new Coord(0, 0)).setLive(false);

        Field actualMatrix = nextGeneration.getNextGeneration(initMatrix);
        //assertArrayEquals(nextMatrix, actualMatrix);
    }


}