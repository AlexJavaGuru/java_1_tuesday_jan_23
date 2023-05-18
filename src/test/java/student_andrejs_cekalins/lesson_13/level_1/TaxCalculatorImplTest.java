package student_andrejs_cekalins.lesson_13.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {
    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @BeforeEach
    void setUp() {
    }

    @Test
    void calculateTaxIfIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }

    @Test
    void calculateTax25PercentIfIncomeIsLessThen20000() {
        var income = BigDecimal.valueOf(19999.00);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("4999.750"));
    }

    @Test
    void CalculateTax25PercentIfIncome20000AndMore() {
        var income = new BigDecimal(20000.00);
        var taxToPay = taxCalculator.calculateTax(income );
        assertEquals(taxToPay, new BigDecimal("5000.00"));
    }
    @Test
    void CalculateTax25PercentFor20000And40PercentForMoreThen20000() {
        var income = new BigDecimal(30000.00);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("9000.00"));
    }
}