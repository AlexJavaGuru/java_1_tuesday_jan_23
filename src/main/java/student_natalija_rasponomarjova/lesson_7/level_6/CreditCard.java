package student_natalija_rasponomarjova.lesson_7.level_6;

class CreditCard {
    private long cardNumber;
    private int pinCode;
    private int accountBalance;
    private int creditLimit;
    private int creditDebt;


    public int getAccountBalance() {

        return accountBalance;
    }


    CreditCard(long cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        accountBalance = 0;
        creditDebt = 0;
        creditLimit = 0;
    }

    public boolean activateCard(long cardNumber, int pinCode) {
        return (this.cardNumber == cardNumber && this.pinCode == pinCode);
    }

    public void depositMoney(boolean activateCard, int deposit) {
        if (activateCard) {
            accountBalance = accountBalance + deposit - creditDebt;
            getAccountBalance();
        } else {
            System.out.println("The money transfer is rejected");
        }
    }

    public void withdrawMoney(boolean activateCard, int withdraw) {
        if (activateCard) {
            accountBalance = (accountBalance - withdraw) - creditDebt;
            getAccountBalance();
        } else {
            System.out.println("The money withdraw is rejected");
        }
    }
}
