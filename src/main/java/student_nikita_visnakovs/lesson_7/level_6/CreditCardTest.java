package student_nikita_visnakovs.lesson_7.level_6;

public class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest tester = new CreditCardTest();
        tester.depositWrongPinTest();
        tester.depositNoDebtTest();
        tester.depositSmallDebtTest();
        tester.depositBigDebtTest();
        tester.withdrawWrongPinTest();
        tester.withdrawNoDebtTest();
        tester.withdrawLessLimitTest();
        tester.withdrawMoreLimitTest();

    }

    public void depositWrongPinTest() {
        CreditCard object = new CreditCard(1111222233334444L, 1234);
        int expectedResult = 0;
        object.deposit(1233, 1000);
        double actualResult = object.getBalance();
        checkResult(expectedResult, actualResult, "Deposit worn Pin test");

    }

    public void depositNoDebtTest() {
        CreditCard object = new CreditCard(111122223333444L, 1234);
        int expectedResult = 500;
        object.deposit(1234, 500);
        double actualResult = object.getBalance();
        checkResult(expectedResult, actualResult, "Deposit with no debt test");

    }
    public void depositSmallDebtTest() {
        CreditCard object = new CreditCard(1111222233334444L, 1234);
        object.setCreditLimit(500);
        object.withdraw(1234,50);
        int expectedResult = 450;
        object.deposit(1234, 500);
        double actualResult = object.getBalance();
        checkResult(expectedResult,actualResult,"Deposit with small debt test");
    }
    public void depositBigDebtTest() {
        CreditCard object = new CreditCard(1111222233334444L, 1234);
        object.setCreditLimit(500);
        object.withdraw(1234, 500);
        int expectedBalance = 0;
        int expectedDebt = 450;
        object.deposit(1234, 50);
        double actualBalance = object.getBalance();
        double actualDebt = object.getCreditDebt();
        checkResult(expectedBalance, actualBalance, expectedDebt, actualDebt,"Deposit with big debt test");
    }
    public void withdrawWrongPinTest () {
        CreditCard object = new CreditCard(1111222233334444L, 1234);
        int expectedResult = 0;
        object.withdraw(1234, 500);
        double actualResult = object.getBalance();
        checkResult(expectedResult,actualResult,"Withdraw with wrong pin test");
    }
    public void withdrawNoDebtTest() {
        CreditCard object = new CreditCard(1111222233334444L, 1234);
        int expectedResult = 500;
        object.deposit(1234, 1000);
        object.withdraw(1234, 500);
        double actualResult = object.getBalance();
        checkResult(expectedResult,actualResult, "Withdraw with no debt test");

    }
    public void withdrawLessLimitTest(){
        CreditCard object = new CreditCard(1111222233334444L, 1234);
        object.setCreditLimit(500);
        int expectedResult = 0;
        int expectedDebt = 50;
        object.deposit(1234,500);
        object.withdraw(1234, 550);
        double actualResult = object.getBalance();
        double actualDebt = object.getCreditDebt();
        checkResult(expectedResult, actualResult , expectedDebt, actualDebt , "Withdraw less limit test");
    }
    public void withdrawMoreLimitTest() {
        CreditCard object = new CreditCard(1111222233334444L, 1234);
        object.setCreditLimit(500);
        int expectedResult = 500;
        int expectedDebt = 0;
        object.deposit(1234, 500);
        object.withdraw(1234, 1050);
        double actualResult = object.getBalance();
        double actualDebt = object.getCreditDebt();
        checkResult(expectedResult,actualResult,expectedDebt,actualDebt,"Withdraw more limit test");
}
    void checkResult(int expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    void checkResult(int expectedResult, double actualResult, double expectedDebt, double actualDebt, String testName) {
        if (expectedResult == actualResult && expectedDebt == actualDebt) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
