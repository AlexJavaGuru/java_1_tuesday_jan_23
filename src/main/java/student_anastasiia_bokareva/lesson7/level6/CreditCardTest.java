package student_anastasiia_bokareva.lesson7.level6;

import java.util.concurrent.Callable;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        int balance = 0;
        int deposit = test.depositM();
        balance = deposit + balance;
        test.withDraw(balance);


    }

    public int depositM() {
        CreditCard card = new CreditCard(56, 000);
        int deposit = card.deposit();
        int expected = 10;
        check(deposit, expected, "deposit");
        return deposit;

    }

    public void check(int realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println("Test " + testName + " is ok");
        } else {
            System.out.println("Test " + testName + " is fail");
        }
    }

    public int withDraw(int balance) {
        CreditCard card = new CreditCard(56,000);
        int realResult = card.withdraw(balance);
        int expectResult = 0;
        check(expectResult,realResult," withdraw ");
        return realResult;
    }
}


