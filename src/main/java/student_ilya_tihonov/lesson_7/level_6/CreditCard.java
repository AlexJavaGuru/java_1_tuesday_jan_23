package student_ilya_tihonov.lesson_7.level_6;

public class CreditCard {


        private String cardNumber;
        private int pinCode;
        private double balance;
        private double creditLimit;
        private double loanDebt;


    public CreditCard(String cardNumber, int pinCode, double balance, double creditLimit){
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = balance;
        this.creditLimit = creditLimit;

    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void  setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(double loanDebt) {
        this.loanDebt = loanDebt;
    }

    public void deposit(int pinCode, double amount) {
        if (pinCode != this.pinCode) {
            System.out.println("Invalid PIN");
            return;
        }

        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (loanDebt > 0) {
            double remainingDebt = loanDebt - amount;
            if (remainingDebt < 0) {
                loanDebt = 0;
                balance = Math.abs(remainingDebt);
            } else {
                loanDebt = remainingDebt;
            }
        } else {
            balance += amount;
        }
    }

    public boolean withdraw(int pin, double amount) {
        if (pinCode != this.pinCode) {
            System.out.println("Invalid PIN");
            return false;
        }

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return false;
        }

        if (balance >= amount) {
            balance -= amount;
        } else {
            double amountToCoverDebt = amount - balance;
            if (loanDebt + amountToCoverDebt > creditLimit) {
                System.out.println("Withdrawal declined - credit limit exceeded");
                return false;
            } else {
                balance = 0;
                loanDebt += amountToCoverDebt;
                System.out.println("Withdrawal of " + amount + " successful");
            }
        }
        return false;
    }


}
