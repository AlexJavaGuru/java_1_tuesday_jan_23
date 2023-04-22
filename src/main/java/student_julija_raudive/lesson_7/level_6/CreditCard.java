package student_julija_raudive.lesson_7.level_6;


import java.math.BigDecimal;

class CreditCard {


    private String cardNumber;
    private int pin;
    private BigDecimal balance;
    public BigDecimal creditLimit;
    private BigDecimal loanDebt;


    CreditCard(String cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pin = pinCode;
        balance = BigDecimal.valueOf(0);
        creditLimit = BigDecimal.valueOf(100);
        loanDebt = BigDecimal.valueOf(0);
    }


    public void deposit(int pinCode, BigDecimal amountOfMoney) {

        BigDecimal counter = new BigDecimal("0.01");

        if (pinIsOk(pinCode)) {
            if (loanDebt.compareTo(BigDecimal.valueOf(0)) > 0) {
                while (loanDebt.doubleValue() > 0 && amountOfMoney.doubleValue() > 0) {
                    amountOfMoney = amountOfMoney.subtract(counter);
                    loanDebt = loanDebt.subtract(counter);
                }
            }
            balance = balance.add(amountOfMoney);
        } else {
            message("Pin code is incorrect");
        }

    }


    public void withdraw(int pinCode, BigDecimal amountOfMoney) {

        if (pinIsOk(pinCode)) {
            if (balance.compareTo(amountOfMoney) > 0) {
                balance = balance.subtract(amountOfMoney);
            } else if (creditLimit.compareTo(loanDebt.add(amountOfMoney).subtract(balance)) > 0) {
                loanDebt = (loanDebt.add(amountOfMoney)).subtract(balance);
                balance = BigDecimal.valueOf(0);
            } else {
                System.out.println("Your credit limit is exceeded");
            }
        } else {
            message("Pin code is incorrect");
        }
    }

    public boolean pinIsOk(int pinCode) {
        return this.pin == pinCode;
    }


    public void message(String message) {
        System.out.println(message);
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getLoanDebt() {
        return loanDebt;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }

}
