package student_aleksandrs_lezhennikovs.lesson_11.level_4.domen;

import student_aleksandrs_lezhennikovs.lesson_11.level_4.rules.FraudRule;
import student_aleksandrs_lezhennikovs.lesson_11.level_4.services.FraudDetectionResult;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {
    List<FraudRule> rulesList;

    public FraudDetector(List<FraudRule> rulesList) {
        this.rulesList = rulesList;
    }

    public FraudDetectionResult isFraud(Transaction transaction) {
        List<String> detectedRules = new ArrayList<>();
        for (FraudRule rule : rulesList) {
            if (rule.isFraud(transaction)) {
                detectedRules.add(rule.getRuleName());
            }
        }
        if (detectedRules.size() > 0) {
            return new FraudDetectionResult(true, detectedRules);
        } else {
            return  new FraudDetectionResult(false);
        }
    }

}
