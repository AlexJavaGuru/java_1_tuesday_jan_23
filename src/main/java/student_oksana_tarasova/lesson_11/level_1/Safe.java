package student_oksana_tarasova.lesson_11.level_1;

public class Safe {

    public int pinCode;
    public double amountOfMoney;

    public Safe(int pinCode, double amountOfMoney) {
        this.pinCode = pinCode;
        this.amountOfMoney = amountOfMoney;
    }

    public void paymentTransaction() {
        if (amountOfMoney > 0) {
            System.out.println("Payment transaction in progress.");
        } else {
            System.out.println("Payment transaction failed. There are no funds on the account");
        }
    }

    @Override
    public String toString() {
        return "Safe{" +
                "pinCode=" + pinCode +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
