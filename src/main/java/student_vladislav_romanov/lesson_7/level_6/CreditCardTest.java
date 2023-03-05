package student_vladislav_romanov.lesson_7.level_6;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.overallTesting();
    }

    public void overallTesting() {
        CreditCard creditCard = new CreditCard("5234670028270119", 1234);
        creditCard.printCardInfo();
        creditCard.increaseLimit(1000);
        creditCard.setDebt(1000);
        creditCard.deposit(1234, 800);
        creditCard.printCardInfo();
        creditCard.decreaseLimit(500);
        creditCard.printCardInfo();
        creditCard.deposit(1234, 800);
        creditCard.printCardInfo();
        creditCard.increaseLimit(500);
        creditCard.printCardInfo();
        creditCard.withdraw(1234, 1000);
        creditCard.printCardInfo();
        creditCard.withdraw(1234, 1000);
        creditCard.printCardInfo();
        creditCard.withdraw(1234, 1000);
        creditCard.printCardInfo();
        creditCard.increaseLimit(500);
        creditCard.printCardInfo();
        creditCard.withdraw(1234, 600);
        creditCard.printCardInfo();
        creditCard.withdraw(1234, 600);
        creditCard.printCardInfo();
        creditCard.deposit(1234, 8000);
        creditCard.printCardInfo();
    }

}
