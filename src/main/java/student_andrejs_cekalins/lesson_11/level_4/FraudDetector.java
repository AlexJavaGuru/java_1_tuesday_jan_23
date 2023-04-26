package student_andrejs_cekalins.lesson_11.level_4;

public class FraudDetector {
    boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getFullName().equals("Pokemon")
                || transaction.getAmount() > 1000000
                || transaction.getTrader().getCity().equals("Sydney")
                || transaction.getTrader().getCountry().equals("Jamaica")
                || (transaction.getTrader().getCountry().equals("Germany") && transaction.getAmount() > 1000)) {
            return true;
        }
        return false;
    }
}
