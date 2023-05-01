package student_vladislav_romanov.lesson_14.level_3_4_5_6;

import java.util.List;

class TransactionAnalysisService {

    List<Transaction> getTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.year() == year)
                .toList();
    }

}
