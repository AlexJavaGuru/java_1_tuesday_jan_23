package student_vladislav_romanov.lesson_14.level_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    TransactionTestData transactionTestData;
    TransactionAnalysisService transactionAnalysisService;
    List<Transaction> transactions;

    @BeforeEach
    void setUp() {
        transactionTestData = new TransactionTestData();
        transactionAnalysisService = new TransactionAnalysisService();
        transactions = transactionTestData.getTransactions();
    }

    @Test
    void getTransactionsByYear2011() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        List<Transaction> actual = transactionAnalysisService.getTransactionsByYear(transactions, 2011);
        assertEquals(expected, actual);
    }

    @Test
    void sortingTransactionsAsc() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        List<Transaction> actual = transactionAnalysisService.sortedTransactions(transactions, "asc");
        assertEquals(expected, actual);
    }

    @Test
    void sortingTransactionsDesc() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> expected = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        );
        List<Transaction> actual = transactionAnalysisService.sortedTransactions(transactions, "desc");
        assertEquals(expected, actual);
    }

    @Test
    void getSortedTransactionsByYear2012Asc() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");

        List<Transaction> expected = Arrays.asList(
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        List<Transaction> actual = transactionAnalysisService.getSortedTransactionsByYear(transactions, 2012, "asc");
        assertEquals(expected, actual);
    }

    @Test
    void getTransactionsYearsList() {
        List<Integer> expected = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        List<Integer> actual = transactionAnalysisService.getTransactionsYearsList(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void getTransactionsUniqueYearsList() {
        List<Integer> expected = Arrays.asList(2011, 2012);
        List<Integer> actual = transactionAnalysisService.getTransactionsUniqueYearsList(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void getTradersNameList() {
        List<String> expected = Arrays.asList("Brian", "Raoul", "Mario", "Alan");
        List<String> actual = transactionAnalysisService.getTradersNameList(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void getTradersNameListByCityCambridge() {
        List<String> expected = Arrays.asList("Brian", "Raoul", "Alan");
        List<String> actual = transactionAnalysisService.getTradersNameListByCity(transactions, "Cambridge");
        assertEquals(expected, actual);
    }

    @Test
    void getTradersNameListByCityMilan() {
        List<String> expected = List.of("Mario");
        List<String> actual = transactionAnalysisService.getTradersNameListByCity(transactions, "Milan");
        assertEquals(expected, actual);
    }

    @Test
    void getTradersCityList() {
        List<String> expected = Arrays.asList("Cambridge", "Milan");
        List<String> actual = transactionAnalysisService.getTradersCityList(transactions);
        assertEquals(expected, actual);
    }

    @Test
    void isAnyTraderBasedOnCityMilan() {
        boolean expected = true;
        boolean actual = transactionAnalysisService.isAnyTraderBasedOnCity(transactions, "Milan");
        assertEquals(expected, actual);
    }

    @Test
    void isAnyTraderBasedOnCityBaghdad() {
        boolean expected = false;
        boolean actual = transactionAnalysisService.isAnyTraderBasedOnCity(transactions, "Baghdad");
        assertEquals(expected, actual);
    }

}