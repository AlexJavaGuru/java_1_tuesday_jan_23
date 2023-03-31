package student_aleksandrs_lezhennikovs.lesson_11.level_4.console_ui;

import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.FraudDetector;
import student_aleksandrs_lezhennikovs.lesson_11.level_4.domen.Transaction;
import student_aleksandrs_lezhennikovs.lesson_11.level_4.services.FraudDetectionResult;


public class FraudDetectorUIAction {
    private FraudDetector fraudDetector;

    public FraudDetectorUIAction(FraudDetector fraudDetector) {
        this.fraudDetector = fraudDetector;
    }

    public void printToConsoleIsFraudResult(Transaction transaction) {
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        System.out.println("For transaction:\n" + transaction + "\nFounded rules: " + result);

    }
}
