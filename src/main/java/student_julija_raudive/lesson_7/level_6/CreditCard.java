package student_julija_raudive.lesson_7.level_6;


import java.math.BigDecimal;

class CreditCard {


    private String cardNumber;
    private int pin;
    private double balance;
    public double creditLimit;
    private double loanDebt;


    CreditCard(String cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pin = pinCode;
        balance = 0;
        creditLimit = 100;
        loanDebt = 0;
    }


    public void deposit(int pinCode, double amountOfMoney) {

        BigDecimal counter = new BigDecimal("0.01");
        BigDecimal amountOfMoneyBigDecimal = BigDecimal.valueOf(amountOfMoney);
        BigDecimal loanDebtBigDecimal = BigDecimal.valueOf(loanDebt);

        if (pinIsOk(pinCode)) {
            if (loanDebt > 0) {
                while (loanDebt > 0 && amountOfMoney > 0) {
                    amountOfMoneyBigDecimal = amountOfMoneyBigDecimal.subtract(counter);
                    amountOfMoney = amountOfMoneyBigDecimal.doubleValue();
                    loanDebtBigDecimal = loanDebtBigDecimal.subtract(counter);
                    loanDebt = loanDebtBigDecimal.doubleValue();
                }
            }
            balance += amountOfMoney;
        } else {
            message("Pin code is incorrect");
        }

    }


    public void withdraw(int pinCode, double amountOfMoney) {
        BigDecimal amountOfMoneyBigDecimal = BigDecimal.valueOf(amountOfMoney);
        BigDecimal loanDebtBigDecimal = BigDecimal.valueOf(loanDebt);
        BigDecimal balanceBigDecimal = BigDecimal.valueOf(balance);

        if (pinIsOk(pinCode)) {
            if (balance > amountOfMoney) {
                balanceBigDecimal = balanceBigDecimal.subtract(amountOfMoneyBigDecimal);
            } else if (creditLimit > (loanDebt + amountOfMoney - balance)) {
                loanDebtBigDecimal = (loanDebtBigDecimal.add(amountOfMoneyBigDecimal)).subtract(balanceBigDecimal);
                balanceBigDecimal = BigDecimal.valueOf(0);
            } else {
                System.out.println("Your credit limit is exceeded");
            }
        } else {
            message("Pin code is incorrect");
        }
        balance = balanceBigDecimal.doubleValue();
        loanDebt = loanDebtBigDecimal.doubleValue();

    }

    public boolean pinIsOk(int pinCode) {
        return this.pin == pinCode;
    }


    public void message(String message) {
        System.out.println(message);
    }


    public double getBalance() {
        return balance;
    }

    public double getLoanDebt() {
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
