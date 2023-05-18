package student_aleksandrs_lezhennikovs.lesson_13.level_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            var taxMoreTwentyThousand = income.subtract(new BigDecimal("20000")).multiply(new BigDecimal("0.40"));
            return taxMoreTwentyThousand.add(new BigDecimal("5000"));
        }
    }
}
