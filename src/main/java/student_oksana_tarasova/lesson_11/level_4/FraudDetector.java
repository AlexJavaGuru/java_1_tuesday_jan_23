package student_oksana_tarasova.lesson_11.level_4;


class FraudDetector {

    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        } else if (t.getAmount() > 1000000) {
            return true;
        } else if (t.getTrader().getCity().equals("Sidney")) {
            return true;
        } else if (t.getTrader().getCountry().equals("Jamaica")) {
            return true;
        } else if (t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }

}
