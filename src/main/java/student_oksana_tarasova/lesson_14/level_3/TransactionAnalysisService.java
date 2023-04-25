package student_oksana_tarasova.lesson_14.level_3;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TransactionAnalysisService {

    List<Transaction> transactions;

    public TransactionAnalysisService(List<Transaction> transaction) {
        this.transactions = transaction;
    }

    public List<Transaction> getTransaction() {
        return transactions;
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter((transaction) -> transaction.getYear() == year)
                .collect(toList());
    }

    public List<Transaction> sortTransactionFromLargestToSmallest(List<Transaction> transactions) {
        return transactions.stream()
                .sorted((transaction1, transaction2) -> transaction2.getValue() - transaction1.getValue())
                .collect(toList());

    }

    public List<Transaction> sortTransactionByYearFromSmallestToLargest(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter((transaction -> transaction.getYear() == year))
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(toList());

    }

    public List<Integer> findAllYearsOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getValue() != 0)
                .map(Transaction::getYear)
                .collect(toList());
    }

    public Set<Integer> findUniqueYearsOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getValue() != 0)
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueTradersName(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getName() != null && !transaction.getTrader().getName().isEmpty())
                .map(transaction -> transaction.getTrader().getName())
                .collect(Collectors.toSet());
    }

    public Set<String> findUniqueTradersCity(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity() != null && !transaction.getTrader().getCity().isEmpty())
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
    }

    public Set<String> findTradersNameFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    public boolean isAnyTraderInTheCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    public Optional<Integer> getTheHighestValue(List<Transaction> transactions) {
        Optional<Integer> maxValue;
        if (transactions.isEmpty()) {
            return Optional.empty();
        } else {
            maxValue = transactions.stream()
                    .map(transaction -> transaction.getValue())
                    .max(Integer::compare);
        }
        return maxValue;
    }

    public Optional<Integer> getTheSmallestValue(List<Transaction> transactions) {
        Optional<Integer> maxValue;
        if (transactions.isEmpty()) {
            return Optional.empty();
        } else {
            maxValue = transactions.stream()
                    .map(transaction -> transaction.getValue())
                    .min(Integer::compare);
        }
        return maxValue;
    }

    public String getListOfTraderNames (List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public String getListOfTraderCities (List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionAnalysisService that = (TransactionAnalysisService) o;
        return Objects.equals(transactions, that.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactions);
    }
}
