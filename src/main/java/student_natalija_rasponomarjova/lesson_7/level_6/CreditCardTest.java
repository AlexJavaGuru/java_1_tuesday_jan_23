package student_natalija_rasponomarjova.lesson_7.level_6;

class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.activateCardTest();
        test.depositMoneyTest();
        test.withdrawMoneyTest();
    }

    public void activateCardTest() {
        CreditCard card = new CreditCard(1234567890762543L, 2056);
        boolean expected = true;
        boolean fact = card.activateCard(1234567890762543L, 2056);
        testResults(expected == fact);

    }

    public void depositMoneyTest() {
        CreditCard card = new CreditCard(1234567890762543L, 2056);
        int expected = 400;
        boolean activateCard = card.activateCard(1234567890762543L, 2056);
        card.depositMoney(activateCard, 400);
        int result = card.getAccountBalance();
        testResults(expected == result);
    }

    public void withdrawMoneyTest() {
        CreditCard card = new CreditCard(1234567890762543L, 2056);
        int expected = 300;
        boolean activateCard = card.activateCard(1234567890762543L, 2056);
        card.depositMoney(activateCard, 400);
        card.withdrawMoney(activateCard, 100);
        int result = card.getAccountBalance();
        testResults(expected == result);
    }
    public void testResults(boolean condition) {
        if (condition) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test Failed");
        }
    }
}
