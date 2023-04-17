package student_vladislav_romanov.lesson_13.level_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        return income.multiply(new BigDecimal("0.25"));
    }

}
