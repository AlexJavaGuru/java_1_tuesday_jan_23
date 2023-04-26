package student_andrejs_cekalins.lesson_11.level_1.Task_4;

public class Safe {
    public int pin;
    public double money;

    Safe(int pin, double money) {
        this.pin = pin;
        this.money = money;
    }

    public int getPin() {
        return pin;
    }

    public double getMoney() {
        return money;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString(){
        return "Safe{"+
                "pin=" +pin +
                ",money" +money +
                '}';
    }
}
