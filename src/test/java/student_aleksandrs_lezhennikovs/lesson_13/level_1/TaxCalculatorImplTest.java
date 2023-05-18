package student_aleksandrs_lezhennikovs.lesson_13.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


import static org.assertj.core.api.Assertions.assertThat;

class TaxCalculatorImplTest {
    private TaxCalculatorImpl victim;

    @BeforeEach
    void setUp() {
        victim = new TaxCalculatorImpl();

    }

    @Test
    void testIncomeIfZero() {
        BigDecimal expected = new BigDecimal("0").stripTrailingZeros();
        BigDecimal actual = victim.calculateTax(new BigDecimal("0")).stripTrailingZeros();
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void testIncomeOneThousand() {
        BigDecimal expected = new BigDecimal("250").stripTrailingZeros();
        BigDecimal actual = victim.calculateTax(new BigDecimal("1000")).stripTrailingZeros();
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void testIncomeIfTwentyThousand() {
        BigDecimal expected = new BigDecimal("5000").stripTrailingZeros();
        BigDecimal actual = victim.calculateTax(new BigDecimal("20000")).stripTrailingZeros();
        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void testIncomeMoreThenTwentyThousand() {
        BigDecimal expected = new BigDecimal("9000").stripTrailingZeros();
        BigDecimal actual = victim.calculateTax(new BigDecimal("30000")).stripTrailingZeros();
        assertThat(expected).isEqualTo(actual);
    }
}