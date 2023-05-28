package student_konstantin_kudrjavtsev.lesson_7.level_6_middle;

class CreditCardDemo {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("122344", "1234");
        String numberCard = creditCard.getNumberCard();
        String pinCode = creditCard.getPinCode();
        double balance = creditCard.getBalance();
        double creditLimit = creditCard.getCreditLimit();
        double loanDebt = creditCard.getLoanDebt();
        creditCard.setCreditingFundsToTheCard("1234", 0);
        creditCard.withdrawalOfFundsFromTheCard("1234", 0);
    }
}
