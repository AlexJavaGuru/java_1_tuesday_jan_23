package student_anastasiia_bokareva.lesson11.level4.test;

import student_anastasiia_bokareva.lesson11.level4.FraudRule1;
import student_anastasiia_bokareva.lesson11.level4.FraudRule2;
import student_anastasiia_bokareva.lesson11.level4.Trader;
import student_anastasiia_bokareva.lesson11.level4.Transaction;

public class FraudRule2Test {

    public static void checkIsFraud() {
        FraudRule2 detector = new FraudRule2("1000001 amount");
        Trader trader = new Trader("Poke", "Riga", "Latvia");
        Transaction t = new Transaction(trader, 1000001);
        boolean realResult = detector.isFraud(t);
        boolean expectedResult = true;
        check(realResult, expectedResult, "is fraud ");
    }

    public static void check(boolean realResult, boolean expectedResult, String nameTest) {
        if (realResult == expectedResult) {
            System.out.println("Test " + nameTest + " is ok!");
        } else {
            System.out.println("Test " + nameTest + " is fail!");
        }
    }
}
