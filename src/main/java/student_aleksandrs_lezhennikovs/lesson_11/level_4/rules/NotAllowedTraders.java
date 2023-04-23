package student_aleksandrs_lezhennikovs.lesson_11.level_4.rules;


import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Transaction;

import java.util.List;

public class NotAllowedTraders extends FraudRule {
    private List<String> notAllowedTraders;

    public NotAllowedTraders(String ruleName, List<String> notAllowedTraders) {
        super(ruleName);
        this.notAllowedTraders = notAllowedTraders;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return notAllowedTraders.contains(transaction.getTrader().getFullName());
    }


}
