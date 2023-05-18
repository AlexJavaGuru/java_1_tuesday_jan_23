package student_andrejs_cekalins.lesson_13.level_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @BeforeEach
    void setUp() {

    }
    @Test
    void addIfEmpty() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    void addOneNumber() {
        assertEquals(0, StringCalculator.add("0"));
    }

    @Test
    void addAndSumTwoNumbers() {
        assertEquals(26, StringCalculator.add("12,14"));
    }

    @Test
    void addThreeNumbersAndSum() {
        assertEquals(29, StringCalculator.add("12,14,3"));
    }
    @Test
    void addUnlimitedNumberOfNumbersAndSum() {
        assertEquals(210, StringCalculator.add("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20"));
    }
    @Test
    void addNumbersDelimitedWithNewLineSymbolAndSum() {
        assertEquals(29, StringCalculator.add("12\n14\n3"));
    }
    @Test
    void addNumbersDelimitedWithCommaAndNewLineSymbolAndSum() {
        assertEquals(33, StringCalculator.add("12\n14\n3,4"));
    }

    @Test
    void addNumbersWithSlashInBracketsWithMultipleDelimitersAndSum() {
        assertEquals(3, StringCalculator.add("//[;]\n1;2"));
    }
    @Test
    void addNumbersWithSlashInTwoBracketsWithMultipleDelimitersAndSum() {
        assertEquals(6, StringCalculator.add("//[;][&]\n1;2&3"));
    }
}