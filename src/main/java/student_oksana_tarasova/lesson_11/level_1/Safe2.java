package student_oksana_tarasova.lesson_11.level_1;

public class Safe2 {
    private int pinCode;
    private double amountOfMoney;

    public Safe2(int pinCode, double amountOfMoney) {
        this.pinCode = pinCode;
        this.amountOfMoney = amountOfMoney;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void putMoney(int pinCode, double cash) {
        if (this.pinCode == pinCode) {
            System.out.println("Put the money in the safe");
            this.amountOfMoney += cash;
        } else {
            System.out.println("Wrong password");
        }
    }

    public void getMoney(int pinCode, double cash) {
        if (this.pinCode == pinCode) {
            if (this.amountOfMoney < cash) {
                System.out.println("Not enough funds in the safe");
            } else {
                System.out.println("Available means of money " + getAmountOfMoney());
                this.amountOfMoney -= cash;
            }
        } else {
            System.out.println("Wrong password");
        }
    }

    @Override
    public String toString() {
        return "Safe2{" +
                "pinCode=" + pinCode +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
