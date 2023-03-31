package student_aleksandrs_lezhennikovs.lesson_11.level_4.rules;

import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Transaction;

import java.util.List;

public class NotAllowedMoreThanAmount extends FraudRule {

    private List<Integer> notAllowedAmounts;

    public NotAllowedMoreThanAmount(String ruleName, List<Integer> notAllowedAmounts) {
        super(ruleName);
        this.notAllowedAmounts = notAllowedAmounts;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        for (Integer amount : notAllowedAmounts) {
            if (transaction.getAmount() > amount) {
                return true;
            }
        }
        return false;
    }

}
