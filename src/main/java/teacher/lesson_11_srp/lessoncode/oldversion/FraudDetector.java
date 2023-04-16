package teacher.lesson_11_srp.lessoncode.oldversion;

import java.util.ArrayList;
import java.util.List;

//- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
//- Rule 2: все транзакции на сумму больше 1 000 000 должны быть отклонены.
//- Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
//- Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
//- Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.
public class FraudDetector {

    List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction transaction) {
        List<String> detectedRules = new ArrayList<>();
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                detectedRules.add(fraudRule.getRuleName());
            }
        }
        if (detectedRules.size() > 0) {
            System.out.println("Fraud DETECTED! " + transaction);
            return new FraudDetectionResult(true, detectedRules);
        }
        return new FraudDetectionResult(false);
    }
}
