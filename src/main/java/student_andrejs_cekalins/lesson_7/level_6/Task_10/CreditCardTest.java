package student_andrejs_cekalins.lesson_7.level_6.Task_10;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.setCreditLimit();
        test.cardsIdentification();
        test.cardsIdentificationFail();
        test.deposit();
        test.withdraw();
    }
    public void setCreditLimit() {
        CreditCard creditCard = new CreditCard(0000000000000003, 1111);
        creditCard.setCreditLimit(1000);
        int expectedResult = 1000;
        int realResult = creditCard.getBalance();
        checkResultDeposit(expectedResult, realResult, "Set credit limit test");
    }

    public void cardsIdentification() {
        CreditCard creditCard = new CreditCard(0000000000000003, 1111);
        int cardsNumber = 0000000000000003;
        int pin = 1111;
        boolean expectedResult = true;
        boolean realResult = creditCard.cardsIdentification(cardsNumber, pin);
        checkResult(expectedResult, realResult, "Cards identification test");
    }
    public void cardsIdentificationFail() {
        CreditCard creditCard = new CreditCard(0000000000000003, 1111);
        int cardsNumber = 0000000000000003;
        int pin = 1110;
        boolean expectedResult = false;
        boolean realResult = creditCard.cardsIdentification(cardsNumber, pin);
        checkResult(expectedResult, realResult, "Cards identification test");
    }

    public void deposit() {
        CreditCard creditCard = new CreditCard(0000000000000003, 1111);
        int cardsNumber = 0000000000000003;
        int pin = 1111;
        boolean cardsIdentification = creditCard.cardsIdentification(cardsNumber,pin);
        int amount = 100;
        int expectedResult = 100;
        creditCard.deposit(amount,cardsIdentification);
        int realResult = creditCard.getBalance();
        checkResultDeposit(expectedResult, realResult, "Deposit test");
    }
    public void withdraw() {
        CreditCard creditCard = new CreditCard(0000000000000003, 1111);
        int cardsNumber = 0000000000000003;
        int pin = 1111;
        boolean cardsIdentification = creditCard.cardsIdentification(cardsNumber,pin);
        int amount = 100;
        creditCard.deposit(amount,cardsIdentification);
        int cash = 25;
        creditCard.withdraw(cash,cardsIdentification);
        int expectedResult = 75;
        int realResult = creditCard.getBalance();
        checkResultDeposit(expectedResult, realResult, "Withdraw test");
    }

    private void checkResult(boolean expectedResult, boolean realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
    private void checkResultDeposit(int expectedResult, int realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = Fail");
        }
    }
}
