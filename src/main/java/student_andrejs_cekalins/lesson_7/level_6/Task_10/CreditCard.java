package student_andrejs_cekalins.lesson_7.level_6.Task_10;

class CreditCard {
    private int cardsNumber;
    private int cardsPinCode;
    private int balance;
    private int creditLimit;
    private int loanDebt;

    CreditCard(int cardsNumber, int cardsPinCode) {
        this.cardsNumber = cardsNumber;
        this.cardsPinCode = cardsPinCode;
        balance = 0;
        creditLimit=0;
        loanDebt =0;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit += creditLimit;
        balance += creditLimit;
    }

    public int getCardsNumber() {
        return cardsNumber;
    }

    public int getCardsPinCode() {
        return cardsPinCode;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getLoanDebt() {
        return loanDebt;
    }

    public boolean cardsIdentification(int cardsNumber, int cardsPinCode) {
        return this.cardsNumber == cardsNumber && this.cardsPinCode == cardsPinCode;
    }

    public void deposit(int amount, boolean cardsIdentification) {
        if (cardsIdentification) {
            balance += amount;
            if (loanDebt < 0) {
                loanDebt += amount;
               if (loanDebt >= 0) {

                }
            }
        }
    }

    public void withdraw(int amount, boolean cardsIdentification) {
        if (cardsIdentification) {
            if (balance > 0 && amount <= balance) {
                balance -= amount;
                if (balance < amount) {
                    creditLimit -= amount;
                    loanDebt = balance - creditLimit;
                }
            }
            if (loanDebt > creditLimit) {
                System.out.println("You don't have enough money in your account to cover a transaction ");
            }
        }
    }
}


