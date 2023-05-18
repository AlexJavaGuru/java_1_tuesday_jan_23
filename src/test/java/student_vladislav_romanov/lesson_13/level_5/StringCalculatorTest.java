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

    @Test
    void newLineSeparatorCase() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 28;
        int actual = stringCalculator.add("1\n23,4");
        assertEquals(expected, actual);
    }

    @Test
    void definedSeparatorCase() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 3;
        int actual = stringCalculator.add("//[;]\n1;2");
        assertEquals(expected, actual);
    }

    @Test
    void definedSeparatorsCase() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 6;
        int actual = stringCalculator.add("//[;][&]\n1;2&3");
        assertEquals(expected, actual);
    }

    @Test
    void veryComplicatedCase() {
        StringCalculator stringCalculator = new StringCalculator();
        int expected = 40901;
        int actual = stringCalculator.add("//[;][&]\n1;2&3 56/7(6&5$21?7;5");
        assertEquals(expected, actual);
    }

    @Test
    void getSeparators() {
        StringCalculator stringCalculator = new StringCalculator();
        String expected = "[\n,;]";
        String actual = stringCalculator.getSeparators("//[;]\n1;2");
        assertEquals(expected, actual);
    }

}