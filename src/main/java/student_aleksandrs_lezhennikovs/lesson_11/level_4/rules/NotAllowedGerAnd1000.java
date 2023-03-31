package student_aleksandrs_lezhennikovs.lesson_11.level_4.rules;

import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Transaction;

public class NotAllowedGerAnd1000 extends FraudRule {

    public NotAllowedGerAnd1000(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany") && transaction.getAmount() > 1000;

    }
}
