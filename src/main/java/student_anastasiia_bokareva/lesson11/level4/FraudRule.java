package student_anastasiia_bokareva.lesson11.level4;

public interface FraudRule {

    boolean isFraud(Transaction t);

    String getRuleName();

}
