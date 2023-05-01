package student_vladislav_romanov.lesson_14.level_3_4_5_6;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    Set<Integer> getTransactionsUniqueYearsList(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::year)
                .collect(Collectors.toSet());
    }

}
