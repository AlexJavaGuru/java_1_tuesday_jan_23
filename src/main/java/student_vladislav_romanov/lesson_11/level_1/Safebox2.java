package student_vladislav_romanov.lesson_11.level_1;

public class Safebox2 {

    private int pin;
    private int moneyAmount;

    Safebox2(int pin, int moneyAmount) {
        this.pin = pin;
        this.moneyAmount = moneyAmount;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void getMoney(int pin, int amount) {
        if (pin == this.pin) {
            this.moneyAmount -= amount;
            System.out.println("Money withdraw");
        } else {
            System.out.println("Pin incorrect");
        }
    }

    public void putMoney(int pin, int amount) {
        if (pin == this.pin) {
            this.moneyAmount += amount;
            System.out.println("Money put");
        } else {
            System.out.println("Pin incorrect");
        }
    }

}
