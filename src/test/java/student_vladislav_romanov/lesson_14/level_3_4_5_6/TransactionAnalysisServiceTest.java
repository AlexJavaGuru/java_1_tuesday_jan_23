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
    void getTransactionsByYear() {
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
        List<Transaction> actual = transactionAnalysisService.sortingTransactions(transactions, "asc");
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
        List<Transaction> actual = transactionAnalysisService.sortingTransactions(transactions, "desc");
        assertEquals(expected, actual);
    }

}