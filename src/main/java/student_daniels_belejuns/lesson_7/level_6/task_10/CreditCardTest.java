package student_daniels_belejuns.lesson_7.level_6.task_10;

public class CreditCardTest {
    public static void main(String[] args) {
        checkTrueAuthentication();
        checkFailAuthentication();
        checkDeposit();
        checkWithdraw();
        checkCardLimit();
    }

    public static void checkTrueAuthentication() {
        CreditCard creditCard = new CreditCard(1251512512, 0000);
        boolean expectedResult = true;
        boolean calculatedResult = creditCard.authentication(1251512512, 0000);
        test("Authentication", expectedResult, calculatedResult);
    }

    public static void checkFailAuthentication() {
        CreditCard creditCard = new CreditCard(2144244124, 1233);
        boolean expectedResult = false;
        boolean calculatedResult = creditCard.authentication(2144244124, 1233);
        test("Authentication fail", expectedResult, calculatedResult);
    }

    public static void test(String actionName, boolean expect, boolean actual) {
        if (expect == actual) {
            System.out.println(actionName + " test PASSED");
        } else {
            System.out.println(actionName + " test FAILED");
        }
    }

    public static void check(String actionName, int expect, int actual) {
        if (expect == actual) {
            System.out.println(actionName + " test PASSED");
        } else {
            System.out.println(actionName + " test FAILED");
        }
    }

    public static void checkDeposit() {
        CreditCard creditCard = new CreditCard(1251512512, 0000);
        boolean authentication = creditCard.authentication(1251512512, 0000);
        int expectedResult = 150;
        creditCard.deposit(150, authentication);
        int calculatedResult = creditCard.getBalance();
        check("Deposit", expectedResult, calculatedResult);
    }

    public static void checkWithdraw() {
        CreditCard creditCard = new CreditCard(1251512512, 0000);
        boolean authentication = creditCard.authentication(1251512512, 0000);
        creditCard.deposit(70, authentication);
        creditCard.withdraw(100, authentication);
        int expectedResult = -30;
        int calculatedResult = creditCard.getBalance();
        check("Withdraw", expectedResult, calculatedResult);
    }

    public static void checkCardLimit() {
        CreditCard creditCard = new CreditCard(1251512512, 0000);
        creditCard.setCreditLimit(100);
        int expectedResult = 100;
        int calculatedResult = creditCard.getCreditLimit();
        check("Credit limit", expectedResult, calculatedResult);
    }
}
