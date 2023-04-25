package student_aleksandrs_lezhennikovs.lesson_14.level_3;

import java.util.*;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    public List<Transaction> getTransactions() {
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
        return transactions;
    }

    public List<Transaction> getAllTransactionByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Transaction> sortReverseTransactionByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue)
                        .reversed())
                .collect(Collectors.toList());
    }

    public List<Transaction> getAllByYearAndSortByValue(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> getAllYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(Collectors.toList());
    }

    public List<Integer> getAllUniqueYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getAllTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> getAllCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Trader> getAllTradersByCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(transaction -> transaction.getTrader())
                .distinct()
                .sorted(Comparator.comparing(trader -> trader.getName()))
                .collect(Collectors.toList());
    }

    public boolean isTraderInCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    public OptionalInt maxValueOfTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(transaction -> transaction.getValue())
                .max();
    }

    public OptionalInt minValueOfTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .mapToInt(transaction -> transaction.getValue())
                .min();
    }

    public String getTradersToString(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .sorted(Comparator.comparing(trader -> trader.getName()))
                .map(trader -> trader.getName())
                .distinct()
                .collect(Collectors.joining(", "));
    }

    public String getCitiesToString(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .sorted(Comparator.comparing(trader -> trader.getCity()))
                .map(trader -> trader.getCity())
                .distinct()
                .collect(Collectors.joining(", "));
    }
}
