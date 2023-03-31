package student_aleksandrs_lezhennikovs.lesson_11.level_4.rules;

import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Transaction;

import java.util.List;

public class NotAllowedCity extends FraudRule {
    private List<String> notAllowedCities;

    public NotAllowedCity(String ruleName, List<String> notAllowedCities) {
        super(ruleName);
        this.notAllowedCities = notAllowedCities;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return notAllowedCities.contains(transaction.getTrader().getCity());
    }
}
