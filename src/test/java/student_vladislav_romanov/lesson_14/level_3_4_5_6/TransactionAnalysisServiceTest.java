package student_vladislav_romanov.lesson_14.level_3_4_5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    TransactionTestData transactionTestData;
    TransactionAnalysisService transactionAnalysisService;

    @BeforeEach
    void setUp() {
        transactionTestData = new TransactionTestData();
        transactionAnalysisService = new TransactionAnalysisService();
    }

    @Test
    void getTransactionsByYear() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        List<Transaction> actual = transactionAnalysisService.getTransactionsByYear(transactionTestData.getTransactions(), 2011);
        assertEquals(expected, actual);
    }

}