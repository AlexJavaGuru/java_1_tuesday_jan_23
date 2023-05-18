package student_vladislav_romanov.lesson_13.level_3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeGeneratorTest {

    boolean[][] fieldExample = {
            {true, true, true, true, false},
            {true, true, false, false, true},
            {false, true, true, true, false},
            {false, false, false, false, true},
            {false, true, true, true, false}};

    Field field = new Field(5, 5, fieldExample);

    @Test
    void cellInRange() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        boolean expected = false;
        boolean actual = lifeGenerator.cellInRange(-1, 0);
        assertEquals(expected, actual);
    }

    @Test
    void cellIsAlive() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        boolean expected = true;
        boolean actual = lifeGenerator.cellIsAlive(0, 2);
        assertEquals(expected, actual);
    }

    @Test
    void checkNeighbours() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        int expected = 7;
        int actual = lifeGenerator.checkNeighbours(1,2);
        assertEquals(expected, actual);
    }

    @Test
    void ruleCellAliveAndTwoNeighbours() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        boolean expected = true;
        int neighbours = lifeGenerator.checkNeighbours(1,4);
        boolean actual = lifeGenerator.cellIsAlive(1, 4) && neighbours == 2;
        assertEquals(expected, actual);
    }

    @Test
    void ruleCellAliveAndThreeNeighbours() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        boolean expected = true;
        int neighbours = lifeGenerator.checkNeighbours(2,3);
        boolean actual = lifeGenerator.cellIsAlive(2, 3) && neighbours == 3;
        assertEquals(expected, actual);
    }

    @Test
    void ruleCellAliveAndLessThanTwoNeighbours() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        boolean expected = true;
        int neighbours = lifeGenerator.checkNeighbours(4,1);
        boolean actual = lifeGenerator.cellIsAlive(4, 1) && neighbours < 2;
        assertEquals(expected, actual);
    }

    @Test
    void ruleCellAliveAndMoreThanThreeNeighbours() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        boolean expected = true;
        int neighbours = lifeGenerator.checkNeighbours(1,1);
        boolean actual = lifeGenerator.cellIsAlive(1, 1) && neighbours > 3;
        assertEquals(expected, actual);
    }

    @Test
    void ruleCellDeadAndThreeOrMoreNeighbours() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        boolean expected = true;
        int neighbours = lifeGenerator.checkNeighbours(1,2);
        boolean actual = !lifeGenerator.cellIsAlive(1, 2) && neighbours >= 3;
        assertEquals(expected, actual);
    }

    @Test
    void generate() {
        LifeGenerator lifeGenerator = new LifeGenerator(field);
        boolean[][] expected = {
                {true, false, true, true, false},
                {false, false, true, true, true},
                {true, true, true, true, true},
                {false, true, true, true, true},
                {false, false, true, true, false}};
        boolean[][] actual = lifeGenerator.generate();
        assertArrayEquals(expected, actual);
    }

}