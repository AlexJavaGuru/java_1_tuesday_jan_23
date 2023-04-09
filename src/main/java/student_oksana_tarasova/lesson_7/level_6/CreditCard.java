package student_oksana_tarasova.lesson_7.level_6;

class CreditCard {
    final long cardNumber;
    final int pinCodeOfTheCard;
    public double balanceCard = 0;
    public double creditLimit;
    public double loanDebt = 0;

    CreditCard(long cardNumber, int pinCodeOfTheCard, double creditLimit) {
        this.cardNumber = cardNumber;
        this.pinCodeOfTheCard = pinCodeOfTheCard;
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pinCodeOfTheCard=" + pinCodeOfTheCard +
                ", balanceCard=" + balanceCard +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }

    long getCardNumber() {
        return cardNumber;
    }

    int getPinCodeOfTheCard() {
        return pinCodeOfTheCard;
    }

    double getLoanDebt() {
        return loanDebt;
    }

    double getBalanceCard() {
        return balanceCard;
    }

    double getCreditLimit() {
        return creditLimit;
    }


    double deposit(int pinCodeOfTheCard, double depositAmount) {
        if (this.pinCodeOfTheCard != pinCodeOfTheCard) {
            System.out.println("Wrong pin code!");
        } else if (depositAmount > loanDebt) {
            balanceCard += (depositAmount - loanDebt);
            creditLimit += loanDebt;
            loanDebt = 0;
        } else if (depositAmount < loanDebt) {
            loanDebt -= depositAmount;
            creditLimit += depositAmount;
        }
        return balanceCard;
    }

    double withdraw(int pinCodeOfTheCard, double withdrawals) {
        if (this.pinCodeOfTheCard != pinCodeOfTheCard) {
            System.out.println("Wrong pin code!");
        } else if (withdrawals > balanceCard + creditLimit) {
            System.out.println("not enough money");
        } else if (balanceCard > withdrawals) {
            balanceCard -= withdrawals;
        } else if (balanceCard < withdrawals) {
            loanDebt += withdrawals - balanceCard;
            balanceCard = 0;
            creditLimit = 500 - loanDebt;
        } else if (withdrawals > creditLimit - loanDebt) {
            System.out.println("not enough money");
        }
        return loanDebt;
    }
}
