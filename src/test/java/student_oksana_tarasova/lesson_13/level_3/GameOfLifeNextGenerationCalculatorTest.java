package student_oksana_tarasova.lesson_13.level_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator testCalculator = new GameOfLifeNextGenerationCalculator();

    @Test
    public void cellWithLessThanTwoLivingNeighbors() {
        String[][] currentGeneration = new String[][]{{"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""}};
        String[][] expectedField = {{"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""}};
        String[][] actual = testCalculator.calculate(currentGeneration);
        assertArrayEquals(actual, expectedField);
    }

    @Test
    public void cellWithTwoLivingNeighbors() {
        String[][] currentGeneration = new String[][]{{"", "", "", "",""},
                                                      {"","", "", "", ""},
                                                      {"", "", "", "", ""},
                                                      {"", "", "",  "",  ""},
                                                      {"", "", "",  "", ""}};
        String[][] expectedField = {{"", "", "", "", ""},
                                    {"",  "", "", "", ""},
                                    {"", "",  "", "", ""},
                                    {"", "", "", "",  ""},
                                    {"", "", "","",""}};
        String[][] actual = testCalculator.calculate(currentGeneration);
        assertArrayEquals(actual, expectedField);
    }

    @Test
    public void deadCellWithThreeLivingNeighborsIsLive() {
        String[][] currentGeneration = new String[][]{{"", "", "", "",""},
                {"","", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "",  "",  ""},
                {"", "", "",  "", ""}};
        String[][] expectedField = {{"", "", "", "", ""},
                {"",  "", "", "", ""},
                {"", "",  "", "", ""},
                {"", "", "", "",  ""},
                {"", "", "","",""}};
        String[][] actual = testCalculator.calculate(currentGeneration);
        assertArrayEquals(actual, expectedField);
    }

    @Test
    public void liveCellMoreThreeLivingNeighborsIsDead() {
        String[][] currentGeneration = new String[][]  {{"", "", "", "",""},
                                                        {"","", "", "", ""},
                                                        {"", "", "", "", ""},
                                                        {"", "", "",  "",  ""},
                                                        {"", "", "",  "", ""}};
        String[][] expectedField =   {{"", "", "", "", ""},
                                      {"",  "", "", "", ""},
                                      {"",  "", "", "", ""},
                                      {"",  "","", "", ""},
                                      {"",  "", "", "", ""}};
        String[][] actual = testCalculator.calculate(currentGeneration);
        assertArrayEquals(actual, expectedField);
    }
}