package student_vladislav_romanov.lesson_13.level_1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    void tax25percentForIncome0() {
        BigDecimal expected = new BigDecimal("0.00");
        BigDecimal actual = taxCalculator.calculateTax(new BigDecimal(0));
        assertEquals(expected, actual);
    }

    @Test
    void tax25percentForIncome10000() {
        BigDecimal expected = new BigDecimal("2500.00");
        BigDecimal actual = taxCalculator.calculateTax(new BigDecimal(10000));
        assertEquals(expected, actual);
    }

    @Test
    void tax25percentForIncome20000() {
        BigDecimal expected = new BigDecimal("5000.00");
        BigDecimal actual = taxCalculator.calculateTax(new BigDecimal(20000));
        assertEquals(expected, actual);
    }

    @Test
    void tax25percentForIncome30000() {
        BigDecimal expected = new BigDecimal("9000.00");
        BigDecimal actual = taxCalculator.calculateTax(new BigDecimal(30000));
        assertEquals(expected, actual);
    }

}