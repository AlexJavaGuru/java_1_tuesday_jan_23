package student_romualds_leitans.lesson_7.lesson_6;

import java.util.concurrent.Callable;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.depositIntoCard();
        test.depositInvalidPinCode();
        test.depositShouldPayOffDebt();
        test.withdrawFromCard();
        test.withdrawFromCardAboveLimit();
        test.withdrawInvalidPinCode();
    }

    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = Fail");
    }

    public void depositIntoCard() {
        CreditCard creditCard = new CreditCard("1323 4040 3123 5555", 1234, 500);
        creditCard.deposit(1234, 100);
        double expectedResult = 100;
        double actualResult = creditCard.getBalance();
        checkResult(actualResult, expectedResult, "Deposit 100 into the credit card");
    }

    public void depositInvalidPinCode() {
        CreditCard creditCard = new CreditCard("1323 4040 3123 5555", 1234, 500);
        creditCard.deposit(0000, 100);
        double expectedResult = 0;
        double actualResult = creditCard.getBalance();
        checkResult(actualResult, expectedResult, "Incorrect pin code!");
    }

    public void depositShouldPayOffDebt() {
        CreditCard creditCard = new CreditCard("1323 4040 3123 5555", 1234, 500);
        creditCard.setDebt(50);
        creditCard.deposit(1234, 100);
        double expectedResult = 50;
        double actualResult = creditCard.getBalance();
        checkResult(actualResult, expectedResult, "Deposit  should pay off the debt");
    }

    public void withdrawFromCard() {
        CreditCard creditCard = new CreditCard("1323 4040 3123 5555", 1234, 500);
        creditCard.setBalance(300);
        creditCard.withdraw(1234, 100);
        double expectedResult = 200;
        double actualResult = creditCard.getBalance();
        checkResult(actualResult, expectedResult, "Withdraw  from the card");

    }

    public void withdrawFromCardAboveLimit() {
        CreditCard creditCard = new CreditCard("1323 4040 3123 5555", 1234, 500);
        creditCard.setBalance(0);
        creditCard.setCreditLimit(500);
        creditCard.setDebt(300);
        creditCard.withdraw(1234, 500);
        double expectedResult = 0;
        double actualResult = creditCard.getBalance();
        checkResult(actualResult, expectedResult, "Withdraw from card above limit");

    }
    public void withdrawInvalidPinCode(){
        CreditCard creditCard =new CreditCard("1323 4040 3123 5555", 1234, 500);
        creditCard.withdraw(0000, 100);
        double expectedResult = 0;
        double actualResult = creditCard.getBalance();
        checkResult(actualResult, expectedResult, "Incorrect pin code!");
    }

}
