package student_anastasiia_bokareva.lesson13.level1;

import java.math.BigDecimal;

public class Rule1 {
    public BigDecimal checkRuleOne(BigDecimal income) {
        BigDecimal limit = new BigDecimal("20001");
        BigDecimal percent = new BigDecimal("0.75");
        if (income.compareTo(limit) < 0) {
            BigDecimal result = income.multiply(percent);
            return result;
        }
        return income;
    }
}

