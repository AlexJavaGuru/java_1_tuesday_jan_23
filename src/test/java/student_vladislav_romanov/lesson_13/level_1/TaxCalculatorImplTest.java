package student_vladislav_romanov.lesson_13.level_1;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {

    @Test
    void calculateTaxFor0() {
        TaxCalculator taxCalculator = new TaxCalculatorImpl();
        BigDecimal expected = BigDecimal.valueOf(0);
        BigDecimal actual = taxCalculator.calculateTax(BigDecimal.valueOf(0));
        assertEquals(expected, actual);
    }

    @Test
    void calculateTaxFor20000() {
        TaxCalculator taxCalculator = new TaxCalculatorImpl();
        BigDecimal expected = BigDecimal.valueOf(5000);
        BigDecimal actual = taxCalculator.calculateTax(BigDecimal.valueOf(20000));
        assertEquals(expected, actual);
    }
}