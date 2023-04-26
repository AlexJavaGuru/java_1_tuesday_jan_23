package student_andrejs_cekalins.lesson_11.level_1.Task_5;

public class Safe2 {
    private int pin;
    private double money;

    Safe2() {
        this.pin = 2220;
        this.money = money;
    }

    public int getPin() {
        return pin;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void putMoneyInTheSafe(int pin, double amount) {
        if (this.pin == pin) {
            money += amount;
            System.out.println("Put money in the safe");
        } else {
            System.out.println("Wrong pin try again!");
        }
    }

    public void getMoneyFromTheSafe(int pin, double amount) {
        if (getPin() == pin) {
            money += amount;
            System.out.println("You can take money from safe");
        } else {
            System.out.println("Wrong pin try again!");
        }
    }
    @Override
    public String toString(){
        return "Safe{"+
                "money" +money +
                '}';
    }
}

