package teacher.lesson_11_srp.lessoncode.oldversion;

public interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
