package student_andrejs_cekalins.lesson_14.level_3_4_5_6;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TransactionAnalysisService {

    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(toList());
    }

    public List<Transaction> findTransactionsByTheYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(toList());
    }

    public List<Transaction> sortingTransactionsAscendingByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    public List<Transaction> sortingYearTransactionsAscendingByValue(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    public List<Integer> findAllYearsWithTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(toList());
    }

    public List<Integer> findAllUniqueYearsWithTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(toList());
    }

    public List<String> findAllUniqueTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(toList());
    }

    public List<String> findAllUniqueTradersCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
    }

    public List<String> findAllTradersFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals(cityToFind))
                .map(trader -> trader.getName())
                .distinct()
                .collect(toList());
    }

    public boolean findAnyTraderInTheCity(List<Transaction> transactions, String cityToCheck) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(cityToCheck));
    }

    public OptionalInt findHighestValueOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .max();
    }

    public OptionalInt findLowestValueOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(Transaction::getValue)
                .min();
    }

    public String allTradersNamesInAlphabetOrder(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));
    }

    public String allCityNamesInAlphabetOrder(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .sorted()
                .distinct()
                .collect(Collectors.joining(", "));
    }
}
