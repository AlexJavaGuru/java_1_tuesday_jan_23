package student_oksana_tarasova.lesson_14.level_3;

import java.util.Arrays;
import java.util.List;

class Demo {
    public static void main(String[] args) {


        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService(transactions);
       System.out.println(transactionAnalysisService.getTransaction());
        System.out.println(transactionAnalysisService.findTransactionsByYear(transactions, 2011));
        System.out.println(transactionAnalysisService.findTransactionsByYear(transactions, 2012));
        System.out.println(transactionAnalysisService.sortTransactionFromLargestToSmallest(transactions));
        System.out.println(transactionAnalysisService.sortTransactionByYearFromSmallestToLargest(transactions, 2012));
        System.out.println(transactionAnalysisService.findAllYearsOfTransactions(transactions));
        System.out.println(transactionAnalysisService.findUniqueYearsOfTransactions(transactions));
        System.out.println(transactionAnalysisService.findUniqueTradersName(transactions));
        System.out.println(transactionAnalysisService.findUniqueTradersCity(transactions));
        System.out.println(transactionAnalysisService.findTradersNameFromCity(transactions, "Cambridge"));
        System.out.println(transactionAnalysisService.isAnyTraderInTheCity(transactions, "London"));
        System.out.println(transactionAnalysisService.getTheHighestValue(transactions));
        System.out.println(transactionAnalysisService.getTheSmallestValue(transactions));
        System.out.println(transactionAnalysisService.getListOfTraderNames(transactions));
        System.out.println(transactionAnalysisService.getListOfTraderCities(transactions));
    }
}