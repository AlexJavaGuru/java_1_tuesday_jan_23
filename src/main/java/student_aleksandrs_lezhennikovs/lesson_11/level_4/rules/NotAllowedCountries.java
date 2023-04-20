package student_aleksandrs_lezhennikovs.lesson_11.level_4.rules;

import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Transaction;

import java.util.List;

public class NotAllowedCountries extends FraudRule {
    private List<String> countries;

    public NotAllowedCountries(String ruleName, List<String> countries) {
        super(ruleName);
        this.countries = countries;
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return countries.contains(transaction.getTrader().getCountry());
    }
}
