package student_vladislav_romanov.lesson_13.level_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void emptyStringCase() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 0;
        int actual = stringCalculator.add("");
        assertEquals(expected, actual);
    }

    @Test
    void oneDigitCase() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 1;
        int actual = stringCalculator.add("1");
        assertEquals(expected, actual);
    }

    @Test
    void twoDigitsCase() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 3;
        int actual = stringCalculator.add("1,2");
        assertEquals(expected, actual);
    }

    @Test
    void sixDigitsCase() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 20;
        int actual = stringCalculator.add("1,2,5,8,1,3");
        assertEquals(expected, actual);
    }

}