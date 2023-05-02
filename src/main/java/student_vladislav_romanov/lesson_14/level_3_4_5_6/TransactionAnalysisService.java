package student_vladislav_romanov.lesson_14.level_3_4_5_6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class TransactionAnalysisService {

    List<Transaction> getTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.year() == year)
                .toList();
    }

    List<Transaction> sortedTransactions(List<Transaction> transactions, String method) {
        if ("asc".equals(method)) {
            return transactions.stream()
                    .sorted(Comparator.comparingInt(Transaction::value))
                    .toList();
        } else if ("desc".equals(method)) {
            return transactions.stream()
                    .sorted(Comparator.comparingInt(Transaction::value).reversed())
                    .toList();
        } else {
            return transactions;
        }
    }

    List<Transaction> getSortedTransactionsByYear(List<Transaction> transactions, int year, String method) {
        transactions = getTransactionsByYear(transactions, year);
        return sortedTransactions(transactions, method);
    }

    List<Integer> getTransactionsYearsList(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::year)
                .toList();
    }

    List<Integer> getTransactionsUniqueYearsList(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::year)
                .distinct()
                .toList();
    }

    List<String> getTradersNameList(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::trader)
                .map(Trader::name)
                .distinct()
                .toList();
    }

    List<String> getTradersNameListByCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::trader)
                .filter(trader -> city.equals(trader.city()))
                .map(Trader::name)
                .distinct()
                .toList();
    }

    List<String> getTradersCityList(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::trader)
                .map(Trader::city)
                .distinct()
                .toList();
    }

    boolean isAnyTraderBasedOnCity(List<Transaction> transactions, String city) {
        return !getTradersNameListByCity(transactions, city).isEmpty();
    }

    Optional<Integer> getLargestTransaction(List<Transaction> transactions) {
        return sortedTransactions(transactions, "desc").stream()
                .map(Transaction::value)
                .findFirst();
    }

}
