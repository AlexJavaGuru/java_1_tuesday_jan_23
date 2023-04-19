package student_oksana_tarasova.lesson_13.level_5;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    public void setUp() {
        stringCalculator = new StringCalculator();

    }

    @Test()
    public void testAddEmptyString() {
        int actual = stringCalculator.add("");
        assertEquals(0, actual);
    }


    @Test
    public void testAddOneNumber() {
        int actual = stringCalculator.add("1");
        assertEquals(1, actual);
    }

    @Test
    public void testAddTwoNumbers() {
        int actual = stringCalculator.add("1,2");
        assertEquals(3, actual);
    }

    @Test
    public void testAddManyNumbers() {
        int actual = stringCalculator.add("4,4,4,4,0,4,4,4,4");
        assertEquals(32, actual);
    }

    @Test
    public void testAddManyNumbersAndSpace() {
        int actual = stringCalculator.add("1\n23,4");
        assertEquals(10, actual);
    }

    @Test
    public void testAddNumbersAndSpace() {
        int actual = stringCalculator.add("1\n");
        assertEquals(1, actual);
    }

    @Test
    public void testAddAnyDelimiters() {
        int actual = stringCalculator.add("1;2");
        assertEquals(3, actual);
    }

    @Test
    public void testAddOtherDelimiters() {
        int actual = stringCalculator.add("2;3;3&3;" +
                "3;3");
        assertEquals(17, actual);
    }
}