package student_aleksandrs_lezhennikovs.lesson_14.level_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionAnalysisServiceTest {
    private TransactionAnalysisService service;

    @BeforeEach
    void setUp() {
        service = new TransactionAnalysisService();
        service.getTransactions();
    }

    @Test
    void testGetAllTransaction2011() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> expected = new ArrayList<>(List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        ));
        List<Transaction> transactions = service.getTransactions();
        List<Transaction> calculated = service.getAllTransactionByYear(transactions, 2011);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testGetAllTransaction2012() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> expected = new ArrayList<>(List.of(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        ));
        List<Transaction> transactions = service.getTransactions();
        List<Transaction> calculated = service.getAllTransactionByYear(transactions, 2012);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testSortTransactionByValue() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> expected = new ArrayList<>(List.of(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        ));
        List<Transaction> transactions = service.getTransactions();
        List<Transaction> calculated = service.sortTransactionByValue(transactions);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testReversedSortTransactionByValue() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> expected = new ArrayList<>(List.of(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        ));
        List<Transaction> transactions = service.getTransactions();
        List<Transaction> calculated = service.sortReverseTransactionByValue(transactions);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testGetAllTransactionByYearAndSortByValue() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> expected = new ArrayList<>(List.of(
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        ));
        List<Transaction> transactions = service.getTransactions();
        List<Transaction> calculated = service.getAllByYearAndSortByValue(transactions, 2012);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testGetAllYears() {
        List<Integer> expected = new ArrayList<>(List.of(
                2011,
                2012,
                2011,
                2012,
                2012,
                2012
        ));
        List<Transaction> transactions = service.getTransactions();
        List<Integer> calculated = service.getAllYears(transactions);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testGetAllUniqueYears() {
        List<Integer> expected = new ArrayList<>(List.of(
                2011,
                2012
        ));
        List<Transaction> transactions = service.getTransactions();
        List<Integer> calculated = service.getAllUniqueYears(transactions);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testGetAllTraders() {
        List<String> expected = new ArrayList<>(List.of(
                "Alan",
                "Brian",
                "Mario",
                "Raoul"
        ));
        List<Transaction> transactions = service.getTransactions();
        List<String> calculated = service.getAllTraders(transactions);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testGetAllCities() {
        List<String> expected = new ArrayList<>(List.of(
                "Cambridge",
                "Milan"
        ));
        List<Transaction> transactions = service.getTransactions();
        List<String> calculated = service.getAllCities(transactions);
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testGetAllTradersByCity() {
        List<Trader> expected = new ArrayList<>(List.of(
                new Trader("Alan", "Cambridge"),
                new Trader("Brian", "Cambridge"),
                new Trader("Raoul", "Cambridge")
        ));
        List<Transaction> transactions = service.getTransactions();
        List<Trader> calculated = service.getAllTradersByCity(transactions, "Cambridge");
        assertThat(calculated).isEqualTo(expected);
    }

    @Test
    void testIsTraderInCity() {
        List<Transaction> transactions = service.getTransactions();
        boolean calculated = service.isTraderInCity(transactions, "Milan");
        assertThat(calculated).isTrue();
    }

    @Test
    void testNotTraderInCity() {
        List<Transaction> transactions = service.getTransactions();
        boolean calculated = service.isTraderInCity(transactions, "Riga");
        assertThat(calculated).isFalse();
    }

    @Test
    void testMaxOfValueInTransaction() {
        List<Transaction> transactions = service.getTransactions();
        OptionalInt calculated = service.maxValueOfTransaction(transactions);
        assertThat(calculated.isPresent());
        assertEquals(1000, calculated.getAsInt());
    }

    @Test
    void testMinOfValueInTransaction() {
        List<Transaction> transactions = service.getTransactions();
        OptionalInt calculated = service.minValueOfTransaction(transactions);
        assertThat(calculated.isPresent());
        assertEquals(300, calculated.getAsInt());
    }

    @Test
    void testGetTradersToString() {
        List<Transaction> transactions = service.getTransactions();
        String expect = "Alan, Brian, Mario, Raoul";
        String calculated = service.getTradersToString(transactions);
        assertThat(calculated).isEqualTo(expect);
    }

    @Test
    void testGetCitiesToString() {
        List<Transaction> transactions = service.getTransactions();
        String expect = "Cambridge, Milan";
        String calculated = service.getCitiesToString(transactions);
        assertThat(calculated).isEqualTo(expect);
    }
}