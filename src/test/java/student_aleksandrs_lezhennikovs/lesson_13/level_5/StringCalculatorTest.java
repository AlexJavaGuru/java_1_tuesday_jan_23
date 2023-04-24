package student_aleksandrs_lezhennikovs.lesson_13.level_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringCalculatorTest {
    private StringCalculator stringCalculator;
    private String initText;
    private int calculated;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void testSplitByComa() {
        initText = "130,#$%^&*() 20";
        calculated = stringCalculator.add(initText);
        assertThat(150).isEqualTo(calculated);
    }

    @Test
    void testEmptyString() {
        initText = "";
        calculated = stringCalculator.add(initText);
        assertThat(0).isEqualTo(calculated);
    }

    @Test
    void testOneNumber() {
        initText = "10#$%^&*()";
        calculated = stringCalculator.add(initText);
        assertThat(10).isEqualTo(calculated);
    }

    @Test
    void testMultiNumberSplitByComa() {
        initText = "10, 20 , #$%^&*()40";
        calculated = stringCalculator.add(initText);
        assertThat(70).isEqualTo(calculated);
    }

    @Test
    void testNumberSplitByComaAndNewLineSymbol() {
        initText = "10//, 20 #$%^&*() \n100,30\n240,\n";
        calculated = stringCalculator.add(initText);
        assertThat(400).isEqualTo(calculated);
    }

}