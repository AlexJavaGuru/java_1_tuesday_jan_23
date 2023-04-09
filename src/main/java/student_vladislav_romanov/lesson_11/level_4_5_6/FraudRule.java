package student_vladislav_romanov.lesson_11.level_4_5_6;

public interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
