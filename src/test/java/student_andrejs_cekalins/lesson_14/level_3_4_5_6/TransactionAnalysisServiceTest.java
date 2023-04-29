package student_andrejs_cekalins.lesson_14.level_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import static org.assertj.core.api.Assertions.assertThat;


class TransactionAnalysisServiceTest {
    TransactionAnalysisService transactionsAnalysisService;
    List<Transaction> transactions;

    @BeforeEach
    void setUp() {

        transactions = Arrays.asList(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950)
        );
        transactionsAnalysisService = new TransactionAnalysisService();
    }

    @Test
    void findTransactionsIn2011() {
        List<Transaction> actual = transactionsAnalysisService.findTransactionsIn2011(transactions);
        assertThat(actual).hasSize(2);
        assertThat(actual).contains(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
    }

    @Test
    void findTransactionsByAllYears() {
        List<Transaction> transactionsAll = TransactionTestData.getTransactions();
        assertThat(transactionsAll).hasSize(6);
        assertThat(transactionsAll).contains(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950)
        );
    }

    @Test
    void findTransactionsByTheYear2011() {
        List<Transaction> transactions2011 = transactionsAnalysisService.findTransactionsByTheYear(transactions, 2011);
        assertThat(transactions2011).hasSize(2);
        assertThat(transactions2011).contains(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
    }

    @Test
    void findTransactionsByTheYear2012() {
        List<Transaction> transactions2012 = transactionsAnalysisService.findTransactionsByTheYear(transactions, 2012);
        assertThat(transactions2012).hasSize(4);
        assertThat(transactions2012).contains(
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950)
        );
    }

    @Test
    void findTransactionsByTheYear2013() {
        List<Transaction> transactions2013 = transactionsAnalysisService.findTransactionsByTheYear(transactions, 2013);
        assertThat(transactions2013).hasSize(0);
        assertThat(transactions2013).contains();
    }

    @Test
    void sortingTransactionsAscending() {
        List<Transaction> sortTransactions = transactionsAnalysisService.sortingTransactionsAscendingByValue(transactions);
        assertThat(sortTransactions).hasSize(6);
        assertThat(sortTransactions).containsExactly(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000)
        );
    }

    @Test
    void sortingYearTransactionsAscendingByValue() {
        List<Transaction> sortTransactions = transactionsAnalysisService.sortingYearTransactionsAscendingByValue(transactions, 2011);
        assertThat(sortTransactions).hasSize(2);
        assertThat(sortTransactions).containsExactly(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
    }

    @Test
    void findAllYearsWithTransactions() {
        List<Integer> allYearsTransactions = transactionsAnalysisService.findAllYearsWithTransactions(transactions);
        assertThat(allYearsTransactions).hasSize(6);
        assertThat(allYearsTransactions).contains(
                2011,
                2012,
                2011,
                2012,
                2012,
                2012
        );
    }

    @Test
    void findAllUniqueYearsWithTransactions() {
        List<Integer> allYears = transactionsAnalysisService.findAllUniqueYearsWithTransactions(transactions);
        assertThat(allYears).hasSize(2);
        assertThat(allYears).contains(
                2011,
                2012);
    }

    @Test
    void findAllUniqueTraders() {
        List<String> allUniqueTraders = transactionsAnalysisService.findAllUniqueTraders(transactions);
        assertThat(allUniqueTraders).hasSize(4);
        assertThat(allUniqueTraders).contains(
                "Brian",
                "Raoul",
                "Mario",
                "Alan"
        );
    }

    @Test
    void findAllUniqueTradersCities() {
        List<String> allUniqueTraders = transactionsAnalysisService.findAllUniqueTradersCities(transactions);
        assertThat(allUniqueTraders).hasSize(2);
        assertThat(allUniqueTraders).contains(
                "Cambridge",
                "Milan"
        );
    }

    @Test
    void findAllTradersFromCity() {
        List<String> allTradersFromCity = transactionsAnalysisService.findAllTradersFromCity(transactions, "Cambridge");
        assertThat(allTradersFromCity).hasSize(3);
        assertThat(allTradersFromCity).contains(
                "Brian",
                "Raoul",
                "Alan"
        );
    }

    @Test
    void notFindAnyTraderInTheCity() {
        boolean actual = transactionsAnalysisService.findAnyTraderInTheCity(transactions, "Riga");
        assertThat(actual).isFalse();
    }

    @Test
    void findAnyTraderInTheCity() {
        boolean actual = transactionsAnalysisService.findAnyTraderInTheCity(transactions, "Milan");
        assertThat(actual).isTrue();
    }

    @Test
    void findHighestValueOfTransactions() {
        OptionalInt highestValue = transactionsAnalysisService.findHighestValueOfTransactions(transactions);
        assertThat(highestValue).hasValue(1000);
    }

    @Test
    void findLowestValueOfTransactions() {
        OptionalInt highestValue = transactionsAnalysisService.findLowestValueOfTransactions(transactions);
        assertThat(highestValue).hasValue(300);
    }

    @Test
    void allTradersNamesInAlphabetOrder() {
        String allTradersNamesInAlphabetOrder = transactionsAnalysisService.allTradersNamesInAlphabetOrder(transactions);
        String expected = "Alan, Brian, Mario, Raoul";
        assertThat(allTradersNamesInAlphabetOrder).isEqualTo(expected);
    }

    @Test
    void allCitiesNamesInAlphabetOrder() {
        String allCityNamesInAlphabetOrder = transactionsAnalysisService.allCityNamesInAlphabetOrder(transactions);
        String expected = "Cambridge, Milan";
        assertThat(allCityNamesInAlphabetOrder).isEqualTo(expected);
    }
}
