package student_vladislav_romanov.lesson_14.level_3_4_5_6;

import java.util.Comparator;
import java.util.List;

class TransactionAnalysisService {

    List<Transaction> getTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.year() == year)
                .toList();
    }

    List<Transaction> sortingTransactions(List<Transaction> transactions, String method) {
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

}
