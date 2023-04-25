package student_andrejs_cekalins.lesson_13.level_1;

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0)
            return income.multiply(new BigDecimal("0.25"));
        else {
            var incomeGreaterThan20000 = income.subtract(new BigDecimal("20000"));
            var taxBefore20000 =new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            var taxAfter20000 = incomeGreaterThan20000.multiply(new BigDecimal("0.4"));
            return taxBefore20000.add(taxAfter20000);
        }
    }
}
