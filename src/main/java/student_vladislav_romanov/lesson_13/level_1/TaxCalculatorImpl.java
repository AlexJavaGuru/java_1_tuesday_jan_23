package student_vladislav_romanov.lesson_13.level_1;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000.00")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            BigDecimal firstStageIncome = new BigDecimal(20000);
            BigDecimal secondStageIncome = income.subtract(firstStageIncome);
            BigDecimal firstStageIncomeTax = firstStageIncome.multiply(new BigDecimal("0.25"));
            BigDecimal secondStageIncomeTax = secondStageIncome.multiply(new BigDecimal("0.40"));
            return firstStageIncomeTax.add(secondStageIncomeTax);
        }
    }

}
