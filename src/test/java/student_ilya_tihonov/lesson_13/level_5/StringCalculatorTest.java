package student_ilya_tihonov.lesson_13.level_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

    @Test
    public void testAddSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        assertEquals(1, result);
    }

    @Test
    public void testAddTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    public void testAddMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1,2,3,4,5");
        assertEquals(15, result);
    }

    @Test
    public void testAddNumbersWithNewlineDelimiter() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    public void testAddNumbersWithCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;\n1;2;3");
        assertEquals(6, result);
    }

    @Test
    public void testAddNumbersWithNewlineOnlyDelimiter() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1\n23,4");
        assertEquals(10, result);
    }

    @Test
    public void testAddNumbersWithDifferentDelimiter() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//;\n1;2");
        assertEquals(3, result);
    }

    @Test
    public void testAddNumbersWithMultipleDelimiters() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("//[;][&]\n1;2&3");
        assertEquals(6, result);
    }

}