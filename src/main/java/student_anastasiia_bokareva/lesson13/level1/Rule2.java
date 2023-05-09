package student_anastasiia_bokareva.lesson13.level1;

import java.math.BigDecimal;

public class Rule2 {
    public BigDecimal checkRuleTwo(BigDecimal income) {
        BigDecimal limit = new BigDecimal("20000");
        BigDecimal percent2 = new BigDecimal("0.6");
        BigDecimal percent = new BigDecimal("0.75");
        if (income.compareTo(limit) > 0) {
            BigDecimal result = limit.multiply(percent).add(income.subtract(limit).multiply(percent2));
            return result;
        }
        return income;
    }
}
