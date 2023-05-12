package student_anastasiia_bokareva.lesson13.level5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void checkStringTwoNumbers() {
        String numbers = "1,2";
        String sum = stringCalculator.add(numbers);
        String result = "3";
        assertEquals(sum, result);
    }

    @Test
    void checkOneNumbers() {
        String numbers = "1";
        String sum = stringCalculator.add(numbers);
        String result = "1";
        assertEquals(sum, result);
    }

    @Test
    void checkIsEmpty() {
        String numbers = " ";
        String sum = stringCalculator.add(numbers);
        String result = "0";
        assertEquals(sum, result);
    }
}


