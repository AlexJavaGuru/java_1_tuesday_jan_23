package student_oksana_tarasova.lesson_14.level_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TransactionAnalysisServiceTest {

    TransactionAnalysisService transactionAnalysisService;

    @BeforeEach
    void setUp() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        transactionAnalysisService = new TransactionAnalysisService(transactions);
    }

    @Test
    void testGetTransactionsByYear2011() {
        Trader brian = new Trader("Brian", "Cambridge");
        Trader raoul = new Trader("Raoul", "Cambridge");
        List<Transaction> transactions = TransactionTestData.getTransactions();
        List<Transaction> actual = transactionAnalysisService.findTransactionsByYear(transactions, 2011);
        assertThat(actual).hasSize(2);
        assertThat(actual).containsExactly(new Transaction(brian, 2011, 300), new Transaction(raoul, 2011, 400));
    }

    @Test
    void testGetTransactionsByYear2012() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        List<Transaction> actual = transactionAnalysisService.findTransactionsByYear(transactions, 2012);
        assertThat(actual).hasSize(4);
        assertThat(actual).contains(new Transaction(raoul, 2012, 1000));
        assertThat(actual).contains(new Transaction(raoul, 2012, 1000));
        assertThat(actual).contains(new Transaction(mario, 2012, 700));
        assertThat(actual).contains(new Transaction(alan, 2012, 950));
    }

    @Test
    void testGetTransactionsByYear2013() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        List<Transaction> actual = transactionAnalysisService.findTransactionsByYear(transactions, 2013);
        assertThat(actual).hasSize(0);
    }

    @Test
    void testSortTransactionFromLargestToSmallest() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = TransactionTestData.getTransactions();
        List<Transaction> actual = transactionAnalysisService.sortTransactionFromLargestToSmallest(transactions);
        assertThat(actual).hasSize(6);
        assertThat(actual).containsExactly(new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300));
    }

    @Test
    void testSortTransactionByYearFromSmallestToLargest() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = TransactionTestData.getTransactions();
        List<Transaction> actual = transactionAnalysisService.sortTransactionByYearFromSmallestToLargest(transactions, 2011);
        assertThat(actual).hasSize(2);
        assertThat(actual).containsExactly(new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
    }

    @Test
    void testFindAllYearsOfTransactions() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        List<Integer> actual = transactionAnalysisService.findAllYearsOfTransactions(transactions);
        assertThat(actual).hasSize(6);
        assertThat(actual).containsExactly(2011, 2012, 2011, 2012, 2012, 2012);
    }

    @Test
    void testFindUniqueYearsOfTransactions() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        Set<Integer> actual = transactionAnalysisService.findUniqueYearsOfTransactions(transactions);
        assertThat(actual).hasSize(2);
        assertThat(actual).containsExactly(2011, 2012);
    }

    @Test
    void testFindUniqueTradersName() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        Set<String> actual = transactionAnalysisService.findUniqueTradersName(transactions);
        assertThat(actual).hasSize(4);
        assertThat(actual).containsExactly("Brian", "Raoul", "Alan", "Mario");
    }

    @Test
    void testFindUniqueTradersCity() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        Set<String> actual = transactionAnalysisService.findUniqueTradersCity(transactions);
        assertThat(actual).hasSize(2);
        assertThat(actual).containsExactly("Milan", "Cambridge");
    }

    @Test
    void testFindTradersNameFromCity() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        Set<String> actual = transactionAnalysisService.findTradersNameFromCity(transactions, "Cambridge");
        assertThat(actual).hasSize(3);
        assertThat(actual).containsExactly("Brian", "Raoul", "Alan");
    }

    @Test
    void testIsAnyTraderInTheCity() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
       boolean actual = transactionAnalysisService.isAnyTraderInTheCity(transactions, "Milan");
       assertTrue(actual);
    }

    @Test
    void testIsAnyTraderInTheCity2() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        boolean actual = transactionAnalysisService.isAnyTraderInTheCity(transactions, "London");
        assertFalse(actual);
    }

    @Test
    void testIsAnyTraderInTheCity3() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        boolean actual = transactionAnalysisService.isAnyTraderInTheCity(transactions, "Cambridge");
        assertTrue(actual);
    }

    @Test
    void testGetTheHighestValue() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        Optional<Integer> actual = transactionAnalysisService.getTheHighestValue(transactions);
        assertThat(actual).hasValue(1000);
    }

    @Test
    void testGetTheSmallestValue() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        Optional<Integer> actual = transactionAnalysisService.getTheSmallestValue(transactions);
        assertThat(actual).hasValue(300);
    }

    @Test
    void testGetListOfTraderNames() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        String actual = transactionAnalysisService.getListOfTraderNames(transactions);
        assertThat(actual).isEqualTo("Alan, Brian, Mario, Raoul");
    }

    @Test
    void testGetListOfTraderCities() {
        List<Transaction> transactions = TransactionTestData.getTransactions();
        String actual = transactionAnalysisService.getListOfTraderCities(transactions);
        assertThat(actual).isEqualTo("Cambridge, Milan");
    }
}