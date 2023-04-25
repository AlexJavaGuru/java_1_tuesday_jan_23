package student_julija_raudive.lesson_7.level_6;

import java.math.BigDecimal;
import java.util.Objects;

class CreditCardTest {

    CreditCard card = new CreditCard("374245455400126", 111);

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.depositWhenNoLoanDebtTest();
        test.depositWhenLoanDebtIsEqualToDepositSumTest();
        test.depositWhenLoanDebtIsLessThanDepositSumTest();
        test.depositWhenLoanDebtIsMoreThanDepositSumTest();
        test.withdrawWhenBalanceIsOkTest();
        test.withdrawWhenBalanceIsLessTest();
        test.withdrawWhenLimitIsExceeded();
        test.depositWhenPinIsIncorrect();
        test.withdrawWhenPinIsIncorrect();


    }

    public void depositWhenNoLoanDebtTest() {
        card.deposit(111, BigDecimal.valueOf(10));
        BigDecimal resultBalance = BigDecimal.valueOf(10);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(0);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Deposit when no loan debt");
    }

    public void depositWhenLoanDebtIsEqualToDepositSumTest() {
        card.withdraw(111, BigDecimal.valueOf(20));
        card.deposit(111, card.getLoanDebt());
        BigDecimal resultBalance = BigDecimal.valueOf(0);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(0);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Deposit sum equals to loan debt");
    }

    public void depositWhenLoanDebtIsLessThanDepositSumTest() {
        card.withdraw(111, BigDecimal.valueOf(15));
        card.deposit(111, card.getLoanDebt().add(BigDecimal.valueOf(8.54)));
        BigDecimal resultBalance = BigDecimal.valueOf(8.54);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(0);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Deposit sum is more than loan debt");

    }

    public void depositWhenLoanDebtIsMoreThanDepositSumTest() {
        card.withdraw(111, BigDecimal.valueOf(35));
        BigDecimal sumToDeposit = card.getLoanDebt().subtract(BigDecimal.valueOf(1));
        card.deposit(111, sumToDeposit);
        BigDecimal resultBalance = BigDecimal.valueOf(0);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(1);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Deposit sum is less than loan debt");
    }

    public void withdrawWhenBalanceIsOkTest() {
        card.deposit(111, BigDecimal.valueOf(100.6));
        card.withdraw(111, BigDecimal.valueOf(50.78));
        BigDecimal resultBalance = BigDecimal.valueOf(48.82);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(0);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Withdraw when balance is OK");
    }

    public void withdrawWhenBalanceIsLessTest() {
        card.withdraw(111, BigDecimal.valueOf(48.83));
        BigDecimal resultBalance = BigDecimal.valueOf(0);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(0.01);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Withdraw when balance is less");
    }

    public void withdrawWhenLimitIsExceeded() {
        card.withdraw(111, BigDecimal.valueOf(200.7));
        BigDecimal resultBalance = BigDecimal.valueOf(0);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(0.01);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Withdraw when credit limit is exceeded");
    }

    public void depositWhenPinIsIncorrect() {
        card.deposit(112, BigDecimal.valueOf(60));
        BigDecimal resultBalance = BigDecimal.valueOf(0);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(0.01);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Deposit when PIN is incorrect");
    }

    public void withdrawWhenPinIsIncorrect() {
        card.withdraw(109, BigDecimal.valueOf(60));
        BigDecimal resultBalance = BigDecimal.valueOf(0);
        BigDecimal resultLoanDebt = BigDecimal.valueOf(0.01);
        checkResults(card.getBalance().compareTo(resultBalance) == 0 && card.getLoanDebt().compareTo(resultLoanDebt) == 0, "Withdraw when PIN is incorrect");
    }


    void checkResults(boolean condition, String testName) {

        System.out.print(testName + ": ");
        if (condition) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }


}
