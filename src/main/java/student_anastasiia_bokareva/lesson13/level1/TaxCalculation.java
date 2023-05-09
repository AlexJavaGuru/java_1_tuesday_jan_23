package student_anastasiia_bokareva.lesson13.level1;

import java.math.BigDecimal;

// Правило номер один:
//- доход до 20000 облагается 25% налогом.

public interface TaxCalculation {
    BigDecimal calculateTax(BigDecimal income);
}
